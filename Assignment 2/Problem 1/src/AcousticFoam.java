/**
 * AcousticFoam.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 2 - Problem #1
 * This class reads dimensions from the input 
 * and calculates volume of an acoustic foam
 */
import java.util.Scanner;

public class AcousticFoam
{
    public static void main (String [] args)
    {
        final int BASE_HEIGHT = 3;
        Scanner scan = new Scanner(System.in);
        int pyramidsAcross, pyramidsDown; //number of pyramids across and down the sheet
        double pyramidWidth, pyramidHeight; //width of base and height of each pyramid
        
        //reads all input data
        System.out.print("Write number of pyramids across the sheet: ");
        pyramidsAcross = scan.nextInt();
        System.out.print("Write number of pyramids down the sheet: ");
        pyramidsDown = scan.nextInt();
        System.out.print("Write width of a base of pyramid in cm: ");
        pyramidWidth = scan.nextDouble();
        System.out.print("Write height of a pyramid in cm: ");
        pyramidHeight = scan.nextDouble();
        System.out.println();
        
        double baseVolume = BASE_HEIGHT * (pyramidsAcross * pyramidWidth) *
                (pyramidsDown * pyramidWidth); //volume of a base
        double pyramidVolume = 1d / 3d * pyramidHeight *
                Math.pow(pyramidWidth, 2); //volume of each pyramid
        double volume = baseVolume + pyramidsAcross * pyramidsDown *
                pyramidVolume; //total volume;
        
        System.out.println("Volume of matherial: " + volume + " cm^3");
    }
}