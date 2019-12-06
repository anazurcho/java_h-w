package anzu;


public class Main {

    public static void main(String[] args) {

//-------------------------------------------------------------
        System.out.println("დავალება I ");
        C c = new C();
        c.method1();
        System.out.println("a-ს ბოლო ციფრი: " + c.method2());
        System.out.println("b-ს პირველი ციფრი: " + c.method3());
        System.out.println("c-ს ციფრთა ჯამი: " + c.method4());
        System.out.println("method2() * method3() = " + c.method5());
        System.out.println("method3() + method5() = " + c.method6());

// -------------------------------------------------------------
        System.out.println("დავალება II ");
        A a = new A();
        a.method1();
        a.method2();
        a.method3();

        B b = new B();
        b.method1();
        b.bmethod1();
        System.out.println("a + b = " + b.bmethod2());
//-------------------------------------------------------------
        System.out.println("დავალება III ");
        Third third = new Third();
        third.stepone();
        third.steptwo();
        third.stepthree();
        third.stepfour();

// -------------------------------------------------------------

    }
}
