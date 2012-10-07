
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
                System.out.println("Digits: " + digit1 + digit2 + digit3);
                
                if (digit1 == digit2 && digit2 == digit3)
                {
                    System.out.println("All three digits are equal");
                }
                else if (digit1 == digit2 || digit2 == digit3 || digit1 == digit3)
                {
                    System.out.println("Some two digits are equal");
                }
            }
        } while (!input.equals("q"));
    }
}
