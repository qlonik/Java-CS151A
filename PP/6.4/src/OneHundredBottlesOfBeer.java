
import java.util.Scanner;

/**
 * OneHundredBottlesOfBeer.java
 * @author user
 * 
 * Programming project 6.4 page 296
 * 
 * app that prints few verses of song "One hundred bottles of beer"
 */

public class OneHundredBottlesOfBeer
{
    public static void main(String[] args)
    {
        //ask user for number of verses
        Scanner scan = new Scanner(System.in);
        System.out.print("Write the number of verses (has to be not more than 100): ");
        int input = scan.nextInt();
        System.out.println();
        
        //if number more than 100, then ask to input again
        while (input > 100)
        {
            System.out.print("It has to be not more than 100. Input again: ");
            input = scan.nextInt();
            System.out.println();
        }
        
        //print verses
        for (int i = 100; i > 100 - input; i--)
        {
            System.out.println(Integer.toString(i) + " bottles of beer on the wall");
            System.out.println(Integer.toString(i) + " bottles of beer");
            System.out.println("If one of those bottles should happen to fall");
            System.out.println(Integer.toString(i - 1) + " bottles of beer on the wall");
            System.out.println();
        }
    }
}
