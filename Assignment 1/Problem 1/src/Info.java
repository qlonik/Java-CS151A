/**
 * Info.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 1 - Problem #1
 * This class reads and then prints Info about person: name, age, 
 * which university he takes part in, and name of pet.
 */
import java.util.Scanner;

public class Info
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String name, age, university, petName;
        
        System.out.println("Write your name");
        name = scan.nextLine();
        System.out.println("Write your age");
        age = scan.nextLine();
        System.out.println("Write your university");
        university = scan.nextLine();
        System.out.println("Write a name of your pet");
        petName = scan.nextLine();
        
        System.out.print("Hello! My name is " + name + " and I am " +
                age + " years old. ");
        System.out.println("I'm enjoying my time at " + university + 
                ", though I miss my pet " + petName + " very much!");
    }
}