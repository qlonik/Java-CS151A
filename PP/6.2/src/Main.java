
import java.util.Scanner;

/**
 * Main.java
 * @author Nikita Volodin
 * 
 * Programming project 6.2 page 296
 * 
 * App that reads a string form the user and prints it one char per line.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a line: ");
        String input = scan.nextLine();
        System.out.println();
        
        for (int i = 0; i < input.length(); i++)
        {
            System.out.println(input.charAt(i));
        }
    }
}
