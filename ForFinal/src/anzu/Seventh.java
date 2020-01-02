package anzu;
import java.util.*;
import java.io.*;


public class Seventh {
    Random rand = new Random();
    int count = 0,  cash = 100, p;
    String ans="";

    public Seventh(){
        System.out.println("გამარჯობა");
        System.out.println("საწყისი ქულაა 100");
        while (true){
            System.out.println("თამაში Y");
            Scanner input = new Scanner(System.in);
            ans = input.nextLine();
            if (ans.equals("Y")|| ans.equals("y")){
                int num = (rand.nextInt(999-100+1)+100);
                int pas = num;
                System.out.println(num);
                while (pas > 0) {
                    p = pas%10;
                    System.out.println(p);
                    if (p==7){
                        count++;
                    }
                    pas = pas/10;
                }
                if (count>0){
                    cash+=count;
                }else{
                    cash--;
                }
                System.out.println("შენ გაქვს");
                System.out.println(cash);
            }
        }

    }
}
