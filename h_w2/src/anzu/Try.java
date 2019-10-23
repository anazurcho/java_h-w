package anzu;
import java.io.*;

public class Try {

    static int countOccurrences(int x,
                                int d)
    {
        int count = 0;
        while (x > 0)
        {
            if (x % 10 == d)
                count++;
            x = x / 10;
        }
        return count;
    }


    static int maxOccurring( int x)
    {   if (x < 0)
            x = -x;

        int result = 0;
        int max_count = 1;

        for (int d = 0; d <= 9; d++)
        {

            int count = countOccurrences(x, d);
            if (count >= max_count)
            {
                max_count = count;
                result = d;
            }
        }
        return result;
    }

    public static void main (String[] args)
    {
        int x = 1223355;
        System.out.println("Max occurring digit is " +
                maxOccurring(x));

    }
}



