package anzu;
import java.util.Scanner;


public class A {
    int x;

    public A(){//ბეჭდავს „Hello“;
        System.out.println("Hello");
    }
    public void method1(){//შეაქვს x ცვლადში მონაცემი კლავიატურიდან;
        System.out.println("x : ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
    }

    public void method2(){//ბეჭდავს x+12-ს;
        System.out.println(x+12);
    }

    public void method3(){//ადგენს x ლუწია თუ კენტი;
        if (x%2==0){
            System.out.println("ლუწია");
        }else System.out.println("კენტია");
    }
}
