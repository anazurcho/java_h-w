package anzu;
import java.util.*;
import java.io.*;


public class First {

    public void method1(){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        Random rand = new Random();
        for (int i=0; i<12; i++){
            arr.add(rand.nextInt(100));
        }
        Collections.sort(arr);
        System.out.println("თავდაპირველი " + Arrays.toString(arr.toArray()));
        int i=0;
        for(Integer listitem : arr){
            if(i%2!=0 || i==0){
                arr1.add(listitem);
            }
            i++;
        }
        System.out.println("ლუწი ინდექსის გარეშე " + Arrays.toString(arr1.toArray()));
    }

}
