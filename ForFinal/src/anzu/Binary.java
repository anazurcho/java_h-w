package anzu;
import java.util.*;
import java.io.*;
import java.lang.*;


public class Binary {
    Scanner input = new Scanner(System.in);

    public Binary() throws Exception{
        filewrite(inttobinary());
//        filewrite(inttobinary);
    }

    private String inttobinary() { //klebadobis mixedviT
        System.out.println("შეიყვანე რიცხვი");
        int ans = input.nextInt();
        System.out.println(Integer.toBinaryString(ans));
        return Integer.toBinaryString(ans);

    }

    private void filewrite(String answer) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter("binary.txt", true));
        writer.write(answer);
        writer.newLine();
        writer.close();
    }
}



//StringBuilder binary = new StringBuilder();
//        int n=15;
//        while (n>0) {
//        if((n&1)==1){
//        binary.append(1);
//        }else
//        binary.append(0);
//        n>>=1;
//        }
//        System.out.println(binary.reverse());
//        Integer.toString(100,16)