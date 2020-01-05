package anzu;
import java.util.*;
import java.io.*;
import java.lang.*;


public class Lang {
    Random rand = new Random();
    private  String alp = "abcdefghijklmnopqrstuvwxyz";

    public Lang() throws Exception{
        String winadadeba = randomwin();
        System.out.println(winadadeba);
        filewrite(winadadeba);
    }

    public String randomword(){
        StringBuilder builder = new StringBuilder();
        String word="";
        int count = rand.nextInt(10);
        System.out.println(count);
        while (count-- != 0) {
            word = builder.toString();
            int character = (int)(Math.random()*alp.length());
            String aso = String.valueOf(alp.charAt(character));
            if (!word.contains(aso)){
                builder.append(alp.charAt(character));
            }else{
                count++;
            }
        }
        return builder.toString();
    }

    public String randomwin(){
        int count = rand.nextInt(10);
        String winadadeba = "";
        while (count-- != 0) {
            winadadeba += " " + randomword();
        }
        return winadadeba;
    }

    private void filewrite(String answer) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter("Word.txt", true));
        writer.write(answer);
        writer.newLine();
        writer.close();
    }

}
