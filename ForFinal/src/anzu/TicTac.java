package anzu;
import java.util.*;
import java.io.*;

public class TicTac {
    private String[][] table;
    private int cash = 100;
    public Random r = new Random();
    Scanner input = new Scanner(System.in);

    public TicTac(){
        table = new String[5][3];
        while (true){
            System.out.println("ითამაშე : Y; else: break;");
            System.out.println("შენი ქულაა");
            System.out.println(cash);
            String s = input.nextLine();
            if (s.equals("Y") || s.equals("y")){
                createTable();
                printTable();
//                if (Win()){
//                    cash+=5;
//                }else {
//                    cash-=5;
//                }
                if (Win1()){
                    cash+=5;
                }else {
                    cash-=5;
                }
//                Win1();
            }else{
                System.out.println("შენი თამაში დასრულებულია");
                break;
            }
        }
    }

    private void createTable(){
        for (int i = 0; i<5; i++){
            for (int j=0; j<3; j++){
                int randomInteger = -2 + (int) (Math.random() * ((2 - (-2)) + 1));
                table[i][j] = Integer.toString(randomInteger);
            }
        }
    }

    private void printTable(){
        for (int i = 0; i<5; i++){
            for (int j=0; j<3; j++){
                System.out.print('(' + table[i][j] + ')');
            }
            System.out.println();
        }
    }

    private boolean Win(){
//        int p = Integer.parseInt(table[0][0]) + Integer.parseInt(table[0][1])+ Integer.parseInt(table[0][2])+
//                Integer.parseInt(table[1][0]) + Integer.parseInt(table[2][0])+ Integer.parseInt(table[3][0]) +
//                Integer.parseInt(table[4][0]);
//        int k = Integer.parseInt(table[0][0]) + Integer.parseInt(table[0][1])+ Integer.parseInt(table[0][2])+
//                Integer.parseInt(table[1][1]) + Integer.parseInt(table[2][1])+ Integer.parseInt(table[3][1]) +
//                Integer.parseInt(table[4][1]);
//        int w = Integer.parseInt(table[0][0]) + Integer.parseInt(table[0][1])+ Integer.parseInt(table[0][2])+
//                Integer.parseInt(table[1][2]) + Integer.parseInt(table[2][2])+ Integer.parseInt(table[3][2]) +
//                Integer.parseInt(table[4][2]);
        int p=0,k=0,w=0;
        for (int i=0; i<5;i++){
            p = Integer.parseInt(table[i][0]) + Integer.parseInt(table[i][1])+ Integer.parseInt(table[i][2])+
                    Integer.parseInt(table[1][0]) + Integer.parseInt(table[2][0])+ Integer.parseInt(table[3][0]) +
                    Integer.parseInt(table[4][0]);
            k = Integer.parseInt(table[i][0]) + Integer.parseInt(table[i][1])+ Integer.parseInt(table[i][2])+
                    Integer.parseInt(table[1][1]) + Integer.parseInt(table[2][1])+ Integer.parseInt(table[3][1]) +
                    Integer.parseInt(table[4][1]);
            w = Integer.parseInt(table[i][0]) + Integer.parseInt(table[i][1])+ Integer.parseInt(table[i][2])+
                    Integer.parseInt(table[1][2]) + Integer.parseInt(table[2][2])+ Integer.parseInt(table[3][2]) +
                    Integer.parseInt(table[4][2]);
            System.out.println(p);
            System.out.println(k);
            System.out.println(w);
            if (p>0 || k>0 || w>0){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }


    public boolean Win1(){
        int f = 0,c = 0, p = 0;
        for (int i=0;i<5;i++){
            f = Integer.parseInt(table[i][0]) + Integer.parseInt(table[i][1])+ Integer.parseInt(table[i][2]);
            if (f>0){
                c++;
            }
        }
        for (int l = 0; l<3; l++){
            p = Integer.parseInt(table[0][l])+Integer.parseInt(table[1][l]) + Integer.parseInt(table[2][l])+
                    Integer.parseInt(table[3][l]) +   Integer.parseInt(table[4][l]);
            if (p>0){
                c++;
            }
        }
        System.out.println(c);
        if (c>4){
            return true;
        }
        return false;

    }
}
