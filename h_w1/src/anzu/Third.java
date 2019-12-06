package anzu;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Third {
    int a, b, x, z;
    int[] randomN = new int[40];
    int[] random5 = new int[5];

    public void stepone(){
        System.out.println("a, b: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        if (a>b){
            x = a;
            a = b;
            b = x;
        }
        System.out.println("a-" + a + " b-" + b);

    }

    public void steptwo(){
        for(int i = 0; i<40; i++){
            int random = new Random().nextInt(b - a + 1) + a;
            randomN[i] = random;
        }
        Arrays.sort(randomN);
        System.out.println("შემთხვევითი* მასივი : ");
        System.out.println(Arrays.toString(randomN));
    }

    public void stepthree(){//ერთ-ერთი მაგ არ გამომიყენებია დიდად უბრალოდ ვცადე
        int resultodd = 0;
        int resulteven = 0;
        for (int i = 0; i<40; i++) {
            if (randomN[i] % 2 != 0){
                resultodd++;
            }else resulteven=40-resultodd;
        }

        System.out.println("ლუწი "+resulteven+" კენტი "+resultodd);
    }

    public void stepfour(){
        int sumeven = 0;
        int even = 0;
        int sumodd = 0;
        int odd = 0;
        for (int i = 0; i<40;i++){
            if (randomN[i]%2==0){
                even++;
                sumeven+=randomN[i];
            }
            else {
                odd++;
                sumodd+=randomN[i];
            }
        }
        System.out.println("ლუწი - " + even + " - " + sumeven + " | " + "კენტი - " + odd + " - " + sumodd);

        if (sumodd>sumeven){
            sumodd = z;
            sumodd = sumeven;
            sumeven = z;
        }
        for(int i = 0; i<5; i++){
            int r = new Random().nextInt(sumeven - sumodd + 1) + sumodd;
            random5[i] = r;
        }
        Arrays.sort(random5);
        System.out.println("შემთხვევითი* მასივი : ");
        System.out.println(Arrays.toString(random5));



    }

}
