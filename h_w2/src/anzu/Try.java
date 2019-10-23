package anzu;

public class Try {
    public int a, b;

    Try(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void two(){
        for (int i = 1; i <= b; i++){
            if (b % i == 0 && isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public void first(){
        if (isPrime(a)){
            System.out.println("martivi");
        }
        else{
            System.out.println("rtuli");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < (n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Try t = new Try(7,20);
        t.first();
//        t.two();
    }

}
