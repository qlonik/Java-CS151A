
import java.util.Scanner;

/**
 * LeapYear.java        Author: Nikita Volodin
 * Programming project 5.1 page 263
 * 
 * LeapYear determinates if year is leap (29 days in February):
 * divisible by 4, and divisible by 400, but not by 100
 */

public class LeapYear
{
    public static void main(String[] args)
    {
        int year;
        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.print("Write a year not less than 1582: ");
            year = scan.nextInt();
            System.out.println();
        }
        while (year < 1582);
        
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}
