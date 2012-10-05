/**
 * Triangle.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 2 - Problem #2
 * This class reads sides of a triangle and
 * calculates area using Heron's formula
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        
        //reads input data
        System.out.print("Write side a in cm: ");
        a = scan.nextDouble();
        System.out.print("Write side b in cm: ");
        b = scan.nextDouble();
        System.out.print("Write side c in cm: ");
        c = scan.nextDouble();
        
        double s = (a + b + c) / 2; //semiperimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); //area
        
        DecimalFormat fmt = new DecimalFormat("0.###");
        System.out.println("Area of triangle: " + fmt.format(area) + " cm^2");
    }
}