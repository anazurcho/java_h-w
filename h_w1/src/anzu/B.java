package anzu;
import java.util.Scanner;


public class B extends A {//განსაზღვრეთ კლასი A შვილობილის კლასი B: დაამატეთ მთელი ტიპის y ცვლადი,
     int y;

     public void bmethod1(){//შეაქვს y ცვლადში მონაცემი კლავიატურიდან;
         System.out.println("y  : ");
         Scanner input = new Scanner(System.in);
         y = input.nextInt();
     }

     public int bmethod2(){//აბრუნებს x+y გამოსახულების მნიშვნელობას;
         return (x + y);
     }
}
