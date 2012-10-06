import java.util.Random;
import java.util.Scanner;

/**
 * HiLoGame.java        Author: Nikita Volodin
 * Programming project 5.4 page 264
 * 
 * HiLoGame 
 */
public class HiLoGame
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int guessedNumber, userGuess, guessQuantity; //random number, how many time user guesses
        String input; //user input
        boolean repeat; //repeat game or halt game
        
        do
        {
            guessedNumber = rnd.nextInt(100) + 1;
            guessQuantity = 0;
            input = "";
            repeat = false;
            
            do
            {
                System.out.println("Guess number from 1 to 100? (Write 'q' to exit)");
                input = scan.nextLine();
                System.out.println();
                
                userGuess = Integer.parseInt(input);
                if (userGuess != guessedNumber)
                {
                    guessQuantity++;
                    if (userGuess < guessedNumber)
                    {
                        System.out.println("Higher");
                    }
                    else if (userGuess > guessedNumber)
                    {
                        System.out.println("Lower");
                    }
                }
            } while (userGuess != guessedNumber || !input.equals("q"));
            
            if (!input.equals("q"))
            {
                if (userGuess == guessedNumber)
                {
                    System.out.println("Congratulations! You win. You guessed: " + 
                            guessQuantity + " times.");
                }
                System.out.print("Do you want to play one more time? (y/n): ");
                input = scan.nextLine();
                if (input.equals("y") || input.equals("Y") ||
                        input.equals("Yes") || input.equals("yes"))
                {
                    repeat = true;
                }
                else
                {
                    repeat = false;
                }
            }
        } while (repeat = true && !input.equals("q"));
    }
}
