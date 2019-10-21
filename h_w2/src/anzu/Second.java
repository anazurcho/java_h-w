package anzu;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Second {
    public static void main(String[] args)throws Exception
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
