package anzu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class PaliWord {
    public  String a;
    public Scanner input = new Scanner(System.in);
    public PaliWord() throws Exception{
        a = input.nextLine();
        if (checkPalin(a)){
            System.out.println(a);
            System.out.println("პალინდრომია და ფაილში ჩაიწერება მანამდე პალინდრომები");
            filewrite(a);
            System.out.println(a);

        }else{
            System.out.println("აბა ბოზი ყოფილა რა ჩავწერო");
        }
    }
    public static boolean isPalindrome(int integer) {
        String intStr = String.valueOf(integer);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }

    private void filewrite(String answer) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter("kali.txt", true));
        writer.write(answer);
        writer.newLine();
        writer.close();
    }


    private static boolean checkPalin(String word){
        int n = word.length();
        word = word.toLowerCase();
        for (int i=0; i<n; i++,n--)
            if (word.charAt(i) != word.charAt(n - 1))
                return false;
        return true;
    }
}
