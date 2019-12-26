package anzu;
import java.util.*;
import java.io.*;


public class Star {
    String name;
    double temperature;
    double diameter;
    ArrayList<Planet>  planetArr = new ArrayList<Planet>();
    Scanner input = new Scanner(System.in);

    public Star() throws Exception{
        getstar();
        filewrite();
//        getinfo();
    }

    public void getstar(){
        System.out.println("star name: ");
        this.name = input.nextLine();
        System.out.println("star temperature: ");
        this.temperature = input.nextDouble();
        System.out.println("star diameter");
        this.diameter = input.nextDouble();
    }

    private void filewrite() throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter("CosmosInfo.txt", true));
        writer.write("         Super Star" + this.name.toUpperCase() + "\n star name is " + this.name
                + "\n star temperature is " + this.temperature + "\n star diameter is " + this.diameter);
        writer.newLine();
        writer.close();
    }

    public void getinfo(){
        System.out.println("        Super Star " + this.name.toUpperCase() + "\n star name is " + this.name
                + "\n star temperature is " + this.temperature + "\n star diameter is " + this.diameter);

    }
}
