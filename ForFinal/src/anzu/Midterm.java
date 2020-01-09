package anzu;

import java.util.*;
import java.io.*;

public class Midterm {
    int a,b;
    int[][] m = new int[5][5];


    public Midterm(){
        firstMethod();
        secondMethod();
        printTable();
        System.out.println(thirdMethod());
//        fourthMethod();
        System.out.println(countOfFive());

    }

    void firstMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("შეიყვანე");
        this.a = sc.nextInt();
        this.b = sc.nextInt();
    }

    void secondMethod(){
        int max = Integer.max(a,b);
        int min = Integer.min(a,b);
        Random rand = new Random();
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                this.m[j][i] = rand.nextInt(max - min + 1) + min;
            }
        }

    }

    ArrayList<Integer> thirdMethod(){
        ArrayList<Integer> maxArr = new ArrayList<>();
        for (int j = 0; j<5; j++){
            int maximum = this.m[0][j];
            for (int i = 0; i<5; i++){
                maximum = Integer.max(maximum, this.m[i][j]);
            }
            maxArr.add(maximum);
        }
        return maxArr;
    }

    void fourthMethod() {
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                System.out.println(String.format("%d (%d %d)", this.m[i][j], i, j));
            }
        }
    }

    private void printTable(){
        for (int i = 0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(String.format("(%d)",  this.m[i][j]));
            }
            System.out.println();
        }
    }

    int countOfFive(){
        int count = 0;
        for (int i = 0; i<5; i++){
            for (int j=0; j<5; j++){
                if (this.m[i][j]==5){
                    count++;
                }
            }
        }
        return count;
    }
}
