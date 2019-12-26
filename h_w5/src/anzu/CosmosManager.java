package anzu;
import java.util.*;
import java.io.*;


public class CosmosManager {
    public CosmosManager() throws Exception{
        management();
    }
    public static void management() throws Exception{
        ArrayList<Star> starsArray = new ArrayList<Star>();
        ArrayList<Planet> plannetsArray = new ArrayList<Planet>();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("ვარსკვლავები 1, პლანეტები 2, გათიშვა დამატების 0: ");
            String s = input.nextLine();
            if (s.equals("1")) {
                Star star = new Star();
                starsArray.add(star);
            }else if (s.equals("2")) {
                Planet planet = new Planet();
                plannetsArray.add(planet);

                for(int i=0; i < starsArray.size(); i++){
                    if(starsArray.get(i).name.equals(planet.starName)){
                        planet.time = planet.gettime(starsArray.get(i).diameter);
                        starsArray.get(i).planetArr.add(planet);
                    }
                }

            }else if (s.equals("0")) {
                break;
            }else break;
        }

        while (true) {
            System.out.print("გასათიშად აკრიფე 25, კოსმოსის სანახახავად 20 " +
                    "ან პლანეტის სახელი რომ მასზე მიიღო ინფო: ");
            String planet_name = input.nextLine();
            if(planet_name.equals("25")){
                break;
            }
            if (planet_name.equals("20")){
                for(int s=0; s<starsArray.size(); s++){
                    starsArray.get(s).getinfo();
                }
                for(int p=0; p<plannetsArray.size();p++){
                    plannetsArray.get(p).getinfo();
                }
                break;
            }
            for(int i=0; i < plannetsArray.size(); i++) {
                if (planet_name.equals(plannetsArray.get(i).name)) {
                    plannetsArray.get(i).getinfo();
                }
            }
        }
    }
}
