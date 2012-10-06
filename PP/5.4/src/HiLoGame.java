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
        int guessedNumber, userGuess = 0, guessQuantity = 0; //random number, how many time user guesses
        String input = ""; //user input
        boolean repeat = false; //repeat game or halt game
        
        do
        {
            //guessedNumber = rnd.nextInt(100) + 1;
            guessedNumber = 50;
            
            do
            {
                //user inputs number
                System.out.print("Guess number from 1 to 100? (Write 'q' to exit): ");
                input = scan.nextLine();
                System.out.println();
                
                //make int from string if it is not q
                if (!input.equals("q"))
                {
                    //try to convert
                    userGuess = Integer.parseInt(input);
                    
                    //if user didn't guess then inc quantity and say lower or higher
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
                }
            //if user did not guess or if input not "q" then we repeat
            } while (userGuess != guessedNumber || !input.equals("q"));
            
            //if we don't exit with input "q" from prev while then do this
            if (!input.equals("q"))
            {
                //if user guessed then we print out message and quantity of guesses
                if (userGuess == guessedNumber)
                {
                    System.out.println("Congratulations! You win. You guessed: " + 
                            guessQuantity + " times.");
                }
                //ask user if he/she wants to play one more time
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
