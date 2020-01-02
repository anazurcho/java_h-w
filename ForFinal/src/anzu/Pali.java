package anzu;
import java.io.*;
import java.util.*;


public class Pali {
    public  int a;
    public Scanner input = new Scanner(System.in);
    public Pali() throws Exception{
        a = input.nextInt();
        if (isPalindrome(a)){
            System.out.println(a);
            System.out.println("პალინდრომია და ფაილში ჩაიწერება მანამდე პალინდრომები");
            for (int i=0; i<=a; i++){
                if (isPalindrome(i)){
                    filewrite(i);
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("აბა ბოზი ყოფილა რა ჩავწერო");
        }
    }
    public static boolean isPalindrome(int integer) {
        String intStr = String.valueOf(integer);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }

    private void filewrite(int answer) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter("Pali.txt", true));
        writer.write(new Integer(answer).toString());
        writer.newLine();
        writer.close();
    }

}
