package anzu;
import java.io.*;
import java.util.*;

public class First {

	public static void main(String[] args) throws Exception{
		double start = 100;
		double finish = 200;
		double i;


		List<Double> arr = new ArrayList<>();

		for (i=start; i<=finish; i+=1){
			arr.add(i);
		}

		BufferedWriter writer = new BufferedWriter(new FileWriter("First.txt", true));

		for (double x : arr){
			x/=100;
			writer.write(function(x));
			writer.newLine();
		}
		writer.close();
	}

	public static String function(double x){
		return (String.valueOf(Math.pow(x,2) + 2 * x + 3));
	}
}
