package anzu;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class First {

	public static void main(String[] args) throws IOException{
		double start = 100;
		double finish = 200;
		double i;

		double y;

		List<Double> arr = new ArrayList<>();

		for (i=start; i<=finish; i+=1){
			arr.add(i);
		}

		BufferedWriter writer = new BufferedWriter(new FileWriter("First.txt", true));

		for (double x : arr){
			x/=100;
			y = Math.pow(x,2) + 2 * x + 3;
			writer.write(String.valueOf(y));
			writer.newLine();
		}
		writer.close();
	}
}
