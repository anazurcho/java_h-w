package anzu;
import java.util.*;
import java.io.*;
import java.lang.*;


public class Lang {
    Random rand = new Random();
    private  String alp = "abcdefghijklmnopqrstuvwxyz";

    public Lang() throws Exception{
        String k = randomword();
        System.out.println(k);
        filewrite(k);
    }

    public String randomword(){
        StringBuilder builder = new StringBuilder();
        int count = rand.nextInt(10);
        while (count-- != 0) {

            int character = (int)(Math.random()*alp.length());
            builder.append(alp.charAt(character));

        }
        return builder.toString();
    }

    private void filewrite(String answer) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter("Word.txt", true));
        writer.write(answer);
        writer.newLine();
        writer.close();
    }

}
