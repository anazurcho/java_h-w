package anzu;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class First {

    public static void main(String[] args) throws IOException{
	    int[] interval = {1,2};
	    double y;

	    BufferedWriter writer = new BufferedWriter(new FileWriter("First.txt", true));
	    for (int x : interval) {
	        y = Math.pow(x,2) + 2 * x + 3;
	        writer.write(String.valueOf(y));
	        writer.newLine();
        }
	    writer.close();
    }
}
