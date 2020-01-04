package anzu;
import java.util.*;


public class classwork10 {
    private Random rand = new Random();
    public classwork10(){
//        first();
//        second();
//        third();
//        fourth();
//        fifth();
    }


    public void first(){ //კოლექციაში შემთხვევითი რიცხვების ჩაწერა დაბეჭდვა
        int[] random5 = new int[5];
        for(int i = 0; i<5; i++){
            int random = rand.nextInt(100);
            random5[i] = random;
        }
        System.out.println("შემთხვევითი* მასივი : ");
        System.out.println(Arrays.toString(random5));
    }

    public void second(){ //კოლექციაში შემთხვევითი რიცხვების ჩაწერა დაბეჭდვა, შეტრიალებულიც
        int[] random5 = new int[5];
        for(int i = 0; i<5; i++){
            int random = rand.nextInt(100);
            random5[i] = random;
        }
        System.out.println(Arrays.toString(random5));
        System.out.println("შემთხვევითი* მასივი : ");

        for(int i = 4; i>=0; i--){
            System.out.println(random5[i]);
        }

    }

    public void third(){ //კოლექციაში შემთხვევითი რიცხვების ჩაწერა დაბეჭდვა, sort
        int[] random5 = new int[5];
        for(int i = 0; i<5; i++){
            int random = rand.nextInt(100);
            random5[i] = random;
        }
        System.out.println(Arrays.toString(random5));
        System.out.println("შემთხვევითი* მასივი დასორტილი : ");
        Arrays.sort(random5);
        System.out.println(Arrays.toString(random5));

    }

    private void fourth() { //klebadobis mixedviT
        Integer[] numbers = new Integer[4];
        Random rand = new Random();
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
            System.out.println(numbers[i]);
        }
        System.out.println("------------");
        Arrays.sort(numbers, Collections.reverseOrder());
        for(int d: numbers) {
            System.out.println(d);
        }
    }


    private void fifth(){//ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი.
        // ჩაამატეთ ბოლოში სამი
        //შემთხვევითი რიცხვი. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია.
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        for (int i = 0; i<5; i++){
            myNumbers.add(rand.nextInt(100));
        }
        for (int i : myNumbers) {
            System.out.println(i);
        }
        System.out.println("-------");
        for (int i = 0; i<3; i++){
            myNumbers.add(rand.nextInt(100));
        }
        for (int i : myNumbers) {
            System.out.println(i);
        }

    }




}
