
import java.util.Scanner;

/**
 * Main.java
 * @author Nikita Volodin
 * 
 * Programming project 6.1 page 296
 * 
 * App that reads an int value and print sum of all even integers 
 * between 2 and the input value, inclusive. Error if input less than 2.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Write an integer not less than 2: ");
        int input = scan.nextInt();
        
        if (input >= 2)
        {
            for (int i = 2; i <= input; i++)
            {
                if (i % 2 == 0)
                {
                    sum += i;
                }
            }
        }
        else 
        {
            System.out.println("Number has to be not less than 2");
        }
        
        if (sum != 0)
        {
            System.out.println("Sum of even numbers in range [2; " + input +
                    "] is " + sum);
        }
    }

}
