package anzu;
import java.util.Scanner;

public class C {


    int a,b,c;

    public void method1(){//ანიჭებს a, b და c ცვლადებს მნიშვნელობებს კლავიატურიდან;
        System.out.println("a, b, c  : ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }

    public int method2(){//აბრუნებს a-ს მნიშვნელობის ბოლო ციფრს;
        return(a%10);
    }

    public int method3(){//აბრუნებს b-ს მნიშვნელობის პირველ ციფრს;
        while (b>=10){
            b/=10;
        }
        return(b);
    }

    public int method4(){//აბრუნებს c-ს მნიშვნელობის ციფრთა ჯამს;
        int ressum = 0;
        while (c>0){
            ressum += c%10;
            c/=10;
        }
        return (ressum);
    }

    public int method5(){//ბეჭდავს მეთოდი 2-ის მნიშნველობისა და მეთოდი 3-ის მნიშვნელობის ნამრავლს;
        int x = method2();
        int y = method3();
        int resmul = x * y;
        return (resmul);
    }

    public int method6(){//ბეჭდავს მეთოდი 3-ის მნიშნველობისა და მეთოდი 5-ის მნიშვნელობის ჯამს.
        int x = method3();
        int y = method5();
        int ressum = x + y;
        return (ressum);
    }


}
