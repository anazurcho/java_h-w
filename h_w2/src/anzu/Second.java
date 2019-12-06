package anzu;
import java.io.*;
import java.util.*;


public class Second {
    public static void main(String[] args)throws IOException
    {
        File file = new File("First.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        List<Double> minmax = new ArrayList<>();
        while ((st = br.readLine()) != null){
            minmax.add(Double.parseDouble(st));
        }
        br.close();
        System.out.println("min is " + Collections.min(minmax));
        System.out.println("min is " + Collections.max(minmax));
    }
}
