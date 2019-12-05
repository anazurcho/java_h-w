package anzu;
import java.util.Random;

public class Language {
    public  String chooselang(String lang){
        String alp;
        switch(lang) {
            case "en":
                alp = "abcdefghijklmnopqrstuvwxyz";
                break;
            case "ge":
                alp = "აბგდევზთიკლმნოპჟრსტუფქღყშჩცძწჭხჯჰ";
                break;
            case "ru":
                alp = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
                break;
            default:
                alp = "აბგდევზთიკლმნოპჟრსტუფქღყშჩცძწჭხჯჰ";
                break;
        }
        return  alp;
    }

    public static int randomint(int min, int max) {
        int x;
        if (min>max){
            x = min;
            min = max;
            max = x;
        }
        Random r = new Random();
        int ans = r.nextInt((max - min) + 1) + min;
        return ans;

    }

    public static String randomword(int minforw,int maxforw,String lang){
        StringBuilder builder = new StringBuilder();
        int count = randomint(minforw,maxforw);
        while (count-- != 0) {

            int character = (int)(Math.random()*lang.length());

            builder.append(lang.charAt(character));

        }
        return builder.toString();
    }

    public static String randomSent(int minfors, int maxfors, int minforw, int maxforw, String lang){
        String words = "";
//        String word = randomword(minforw,maxforw,lang);
        int string = randomint(minfors,maxfors);
        while (string-- != 0){
            words += " "+randomword(minforw,maxforw,lang);
        }
        return words;
    }


    public static String paragr(int p, int minfors, int maxfors, int minforw, int maxforw, String lang) {
        String senta = "";
        while (p-- != 0){
            senta += "\n"+randomSent(minfors, maxfors, minforw, maxforw, lang);
        }
        return senta;

    }
    public static String result(int p, int minfors, int maxfors, int minforw, int maxforw, String lang) {
        String result = "";
        result = paragr(p,minfors, maxfors, minforw, maxforw, lang);
        return result;
    }


}
