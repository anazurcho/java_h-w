package anzu;
import java.io.*;
import java.util.*;


public class Planet {
    String name;
    String starName;
    double distanceFromStar;
    double rate;
    double time;
    Scanner input = new Scanner(System.in);

    public Planet() throws Exception{
        getplanet();
        filewrite();
//        getinfo();
    }

    public void getplanet(){
        System.out.println("planet name: ");
        this.name = input.nextLine();
        System.out.println("planets star name: ");
        this.starName = input.nextLine();
        System.out.println("distance from Star");
        this.distanceFromStar = input.nextDouble();
        System.out.println("planets rate");
        this.rate = input.nextDouble();
    }

    private void filewrite() throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter("CosmosInfo.txt", true));
        writer.write("         Super Planet " + this.name.toUpperCase() + "\n planet name is " + this.name
                + "\n planets star name: " + this.starName + "\n distance from Star " + this.distanceFromStar
                + "\n planets rate " + this.rate +  "\nand the time " + this.time);
        writer.newLine();
        writer.close();
    }

    public double gettime(double diameter){
        return (diameter/2+this.distanceFromStar)*Math.PI/this.rate;
    }

    public void getinfo(){
        System.out.println("         Super Planet " + this.name.toUpperCase() + "\n planet name is " + this.name
                + "\n planets star name: " + this.starName + "\n distance from Star " + this.distanceFromStar
                + "\n planets rate " + this.rate + "\nand the time " + this.time);

    }
}
