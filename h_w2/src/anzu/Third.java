package anzu;
import java.util.*;
import java.io.*;


public class Third implements Interface{

    private int a, b;

    Third(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void one(){
        for (int k = a; k<=b; k++){
            System.out.println(k);
        }
    }

    public void two(){
        for (int i = 1; i<=a; i++){
            if (a % i == 0){
                System.out.println(i);
            }
        }
    }

    public void three(){
        for (int p = 1; p<=b; p++){
            if (b % p == 0 && isPrime(p)){
                System.out.println(p);
            }
        }
    }

    public void four(){
        System.out.println(maxOccurring(b));
    }

    static int maxOccurring(int x)
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

    public static boolean isPrime(int n) {


        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Third t = new Third(2001, 2012);
        System.out.println("მეთოდი 1: ბეჭდავს ყველა მთელ რიცხვს a-სა და b-ს შორის;");
//        t.one();
        System.out.println("მეთოდი 2: ბეჭდავს a-ს ყველა გამყოფს;");
//        t.two();
        System.out.println("მეთოდი 3: ბეჭდავს b-ს ყველა მარტივ გამყოფს;");
        t.three();
        System.out.println("მეთოდი 4: აბრუნებს b-ს ჩანაწერში ყველაზე ხშირად გამეორებად ციფრს.");
//        t.four();
    }



}
