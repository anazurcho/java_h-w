package anzu;
import java.util.Random;

public class Language implements LangInter {
    @Override
    public String chooselang(String lang){//აღმოჩნდა რომ ასე არ იყო !
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

    public String langchoose(String lang){
        char first, last;
        String alp = "";
        switch (lang) {
            case "en":
                first = 'a';
                last = 'z';
                break;
            case "ge":
                first = 'ა';
                last = 'ჰ';
                break;
            case "ru":
                first = 'а';
                last = 'я';
                break;
            default:
                first = 'a';
                last = 'z';
                break;
        }
        for(int i = (int)first; i <= (int)last; i++){
            alp += (char)i;
        }

        return alp;
    }

    @Override
    public int randomint(int min, int max) {
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
    @Override
    public String randomword(int wordstarts,int maxforw,String lang){
        StringBuilder builder = new StringBuilder();
        int count = randomint(wordstarts,maxforw);
        while (count-- != 0) {

            int character = (int)(Math.random()*lang.length());

            builder.append(lang.charAt(character));

        }
        return builder.toString();
    }

    public String randomSent(int stringstarts, int stringends, int wordstarts, int wordends, String lang){
        String words = "";
        int string = randomint(stringstarts,stringends);
        while (string-- != 0){
            words += " "+randomword(wordstarts,wordends,lang);
        }
        return words;
    }


    public String paragr(int paragraphn, int stringstarts, int stringends, int wordstarts, int wordends, String lang) {
        String senta = "";
        while (paragraphn-- != 0){
            senta += "\n"+randomSent(stringstarts, stringends, wordstarts, wordends, lang);
        }
        return senta;

    }
    public String result(int paragraphn, int stringstarts, int stringends, int wordstarts, int wordends, String lang) {
        String result = "";
        result = paragr(paragraphn,stringstarts, stringends, wordstarts, wordends, lang);
        return result;
    }

}
