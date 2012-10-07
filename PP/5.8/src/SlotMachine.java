
import java.util.Random;
import java.util.Scanner;

/**
 * SlotMachine.java
 * @author Nikita Volodin
 * 
 * Programming project 5.8 page 265
 * 
 * Class simulates slot machine, that shows 3 digits from range [0; 9]
 * and says if 2 any number are equal or 3 number are equal
 */

public class SlotMachine
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        
        //stores user input string
        String input;
        int digit1, digit2, digit3;
        
        do
        {
            System.out.print("Press enter to play (q to quit) ");
            input = scan.nextLine();
            System.out.println();
            
            if (!input.equals("q"))
            {
                digit1 = rnd.nextInt(10);
                digit2 = rnd.nextInt(10);
                digit3 = rnd.nextInt(10);
                
                //output will be 3 numbers instead of sum of them because 
                //first concatenation with string and then again 2 concatenations
                System.out.println("Digits: " + digit1 + digit2 + digit3);
                
                //if all three equals
                if (digit1 == digit2 && digit2 == digit3)
                {
                    System.out.println("All three digits are equal");
                }
                //if any two equals
                else if (digit1 == digit2 || digit2 == digit3 || digit1 == digit3)
                {
                    System.out.println("Some two digits are equal");
                }
            }
        } while (!input.equals("q"));
    }
}
