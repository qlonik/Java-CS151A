
import java.util.Scanner;

/**
 * Main.java        Author: Nikita Volodin
 * Programming project 5.3 page 264
 * 
 * This class shows how many odd, even and zero digits in an int value
 */
public class Main 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int[] digits = new int[3]; //[0] - zero, [1] - odd, [2] - even
        
        while (value > 0)
        {
            if (value % 10 == 0)
            {
                digits[0]++;
            }
            else if ((value % 10) % 2 == 1)
            {
                digits[1]++;
            }
            else if ((value %10) % 2 == 0)
            {
                digits[2]++;
            }
            value = value / 10;
        }
        
        System.out.println("Zero:\t" + digits[0] + "\nOdd:\t" + digits[1] +
                "\nEven:\t" + digits[2]);
    }
}
