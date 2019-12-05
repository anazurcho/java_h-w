package anzu;

public interface gitLangInter {
    public int randomint(int min, int max);
    public String chooselang(String lang);
    public String randomword(int wordstarts,int maxforw,String lang);
    public String randomSent(int stringstarts, int stringends, int wordstarts, int wordends, String lang);
    public String paragr(int paragraphn, int stringstarts, int stringends, int wordstarts, int wordends, String lang);
    public String result(int paragraphn, int stringstarts, int stringends, int wordstarts, int wordends, String lang);

}
