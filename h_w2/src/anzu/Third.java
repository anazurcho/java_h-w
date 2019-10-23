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

    public static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Third t = new Third(17, 20);
//        t.one();
//        t.two();
        t.three();
    }



}
