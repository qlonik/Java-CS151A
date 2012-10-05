/**
 * Energy.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 1 - Problem #2
 * This class calculates Energy that needed to heat water from
 * one init temp to final temp with certain mass
 */
import java.util.Scanner;

public class Energy
{
    public static void main(String[] args)
    {
        final int WATERHEATCAPACITY = 4184;
        Double energy, massOfWater, initialTemperature, finalTemperature;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("What's the mass of water in kg?");
        massOfWater = scan.nextDouble();
        System.out.println("What's the initial temperature in Celcius?");
        initialTemperature = scan.nextDouble();
        System.out.println("What's the final temperature in Celcius?");
        finalTemperature = scan.nextDouble();
        
        energy = massOfWater * (finalTemperature - initialTemperature) * WATERHEATCAPACITY;
        
        System.out.println("Energy needed: " + energy + " Joules");
    }         
}