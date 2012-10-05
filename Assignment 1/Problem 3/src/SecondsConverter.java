/**
 * SecondsConverter.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 1 - Problem #3
 * This class converts seconds to hours, min, sec
 */
import java.util.Scanner;

public class SecondsConverter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int timeInHours, timeInMinutes, timeInSeconds;
        
        System.out.println("Write time in seconds");
        timeInSeconds = scan.nextInt();
        
        if (timeInSeconds < 60) {
            System.out.println(timeInSeconds + " seconds");
        }
        else if (timeInSeconds < 3600) {
            timeInMinutes = timeInSeconds / 60;
            timeInSeconds = timeInSeconds % 60;
            System.out.print(timeInMinutes + " minutes");
            if (timeInSeconds != 0) {
                System.out.print(", " + timeInSeconds + " seconds");
            }
            System.out.println();
        }
        else {
            timeInHours = timeInSeconds / 3600;
            timeInMinutes = (timeInSeconds % 3600) / 60;
            timeInSeconds -= timeInHours * 3600 + timeInMinutes * 60;
            System.out.print(timeInHours + " hours");
            if (timeInMinutes != 0) {
                System.out.print(", " + timeInMinutes + " minutes");
            }
            if (timeInSeconds != 0) {
                System.out.print(", " + timeInSeconds + " seconds");
            }
            System.out.println();
        }
    }
}