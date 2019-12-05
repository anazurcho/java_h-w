package anzu;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String lang;
        String para;
        Scanner scanner = new Scanner(System.in);
        System.out.print("აირჩიეთ ენა : ");
        lang = scanner.nextLine();

        System.out.print("შეიყვანეთ პარამეტრები: ");
        System.out.println("(like : p-2-s-5-7-w-7-9)");
        para = scanner.nextLine();
        String[] arrOfStr = para.split("-");
//        for (String a : arrOfStr){
//            System.out.println(a);}
        int first = Integer.parseInt(arrOfStr[6]);
        int second = Integer.parseInt(arrOfStr[7]);
        int firstfors = Integer.parseInt(arrOfStr[4]);
        int secondfors = Integer.parseInt(arrOfStr[3]);
        int firstforp = Integer.parseInt(arrOfStr[1]);
//

        Language langu = new Language();
        String stringLang = langu.chooselang(lang);
        System.out.println(langu.result(firstforp,firstfors,secondfors,first,second,stringLang));

    }
}
