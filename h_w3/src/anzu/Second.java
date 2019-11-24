package anzu;

import java.util.*;

public class Second {
    public void method1(){
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        int a=5;
        int b=10;
        int c=20;
        int d=25;

        for (int i=0; i<12;i++){
            arr.add(rand.nextInt(b-a+1)+a);
        }
        System.out.println("თავდაპირველი " + Arrays.toString(arr.toArray()));
//        System.out.println(Arrays.toString(arr.toArray()));


        for (int i=3; i<arr.size();i+=4){
                arr.add(i+1,rand.nextInt(d-c+1)+c);
        }
//        System.out.println(Arrays.toString(arr.toArray()));
        System.out.println("მიღებული " + Arrays.toString(arr.toArray()));

    }
}
