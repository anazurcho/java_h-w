package anzu;
import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Calc {
    private String inputed="";
    public DateTimeFormatter historytime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    public LocalDateTime now = LocalDateTime.now();


    public Calc() throws Exception{
        System.out.println("შეიყვანეთ ამოცანა");
        Scanner input = new Scanner(System.in);
        while (!inputed.equals("exit")) {
            System.out.print("<< ");
            inputed = input.nextLine();
            inputed = opn(inputed);
            double answer = calculate(inputed);
            filewrite(answer);
        }
    }

      private void filewrite(double answer) throws Exception{
        double numround = Math.round(answer*100)/100.0;
        String s = String.valueOf(numround);
        System.out.println(numround);
        BufferedWriter writer = new BufferedWriter(new FileWriter("History.txt", true));
        writer.write(historytime.format(now) + "  " + s);
        writer.newLine();
        writer.close();
    }

    private static String opn(String inputed)  {
        StringBuilder sbStack = new StringBuilder("");
        StringBuilder sbOut = new StringBuilder("");
        char cIn, cTmp;
        for (int i = 0; i < inputed.length(); i++) {
            cIn = inputed.charAt(i);
            if (isOperator(cIn)) {
                while (sbStack.length() > 0) {
                    cTmp = sbStack.substring(sbStack.length()-1).charAt(0);
                    if (isOperator(cTmp) && (priorOp(cIn) <= priorOp(cTmp))) {
                        sbOut.append(" ").append(cTmp).append(" ");
                        sbStack.setLength(sbStack.length()-1);
                    } else {
                        sbOut.append(" ");
                        break;
                    }
                }
                sbOut.append(" ");
                sbStack.append(cIn);
            } else if ('(' == cIn) {
                sbStack.append(cIn);
            } else if (')' == cIn) {
                cTmp = sbStack.substring(sbStack.length()-1).charAt(0);
                while ('(' != cTmp) {
                    sbOut.append(" ").append(cTmp);
                    sbStack.setLength(sbStack.length()-1);
                    cTmp = sbStack.substring(sbStack.length()-1).charAt(0);
                }
                sbStack.setLength(sbStack.length()-1);
            } else {
                sbOut.append(cIn);
            }
        }
        while (sbStack.length() > 0) {
            sbOut.append(" ").append(sbStack.substring(sbStack.length()-1));
            sbStack.setLength(sbStack.length()-1);
        }

        return  sbOut.toString();
    }

    private static boolean isOperator(char oper) {
        switch (oper) {
            case '-':
            case '+':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }

    private static byte priorOp(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
        }
        return 1;
    }

    private static double calculate(String inputed) {
        double firstd = 0;
        double secondd = 0;
        String sTmp;
        Deque<Double> stack = new ArrayDeque<Double>();
        StringTokenizer st = new StringTokenizer(inputed);
        while(st.hasMoreTokens()) {
                sTmp = st.nextToken().trim();
                if (1 == sTmp.length() && isOperator(sTmp.charAt(0))) {
                    if (stack.size() < 2) {
                        System.out.println("ამოცანაში შეცდომაა");
                    }
                    secondd = stack.pop();
                    firstd = stack.pop();
                    switch (sTmp.charAt(0)) {
                        case '+':
                            firstd += secondd;
                            break;
                        case '-':
                            firstd -= secondd;
                            break;
                        case '/':
                            firstd /= secondd;
                            break;
                        case '*':
                            firstd *= secondd;
                            break;
                        case '%':
                            firstd %= secondd;
                            break;
                        case '^':
                            firstd = Math.pow(firstd, secondd);
                            break;
                        default:
                            System.out.println("შეცდომაა");
                    }
                    stack.push(firstd);
                }
                else {
                    firstd = Double.parseDouble(sTmp);
                    stack.push(firstd);
                }
            }


        if (stack.size() > 1) {
            System.out.println("შეცდომაა");
        }

        return stack.pop();
    }
}