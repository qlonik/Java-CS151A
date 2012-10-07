
import java.util.Random;
import java.util.Scanner;

/**
 * RockPaperScissors.java
 * @author Nikita Volodin
 * 
 * Programming project 5.7 page 264
 * 
 * Application that emulates game rock paper scissors
 */

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        //create some variables
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        
        //variable for user input
        String input = "";
        
        //variables to count wins, losses and ties
        int wins = 0, losses = 0, ties = 0;
        
        //variable for user gesture and machine gesture
        //format:
        //2 - rock
        //1 - scissors
        //0 - paper
        int userValue, machineValue;
        
        //while user don't input q (quit) we play
        while (!input.equals("q"))
        {
            //ask user for gesture
            System.out.print("Write your gesture (q for quit): ");
            input = scan.nextLine();
            System.out.println();
            
            //if user didn't put q (quit) we generate our gesture and play
            if (!input.equals("q"))
            {
                //generate our value
                machineValue = rnd.nextInt(3);
                
                //try to transfer user input to a number
                //if we can't do this, then ask user to rewrite guess
                //and try to transfer, if ok go further
                do
                {
                    //transfer user input to a number in our format
                    userValue = transferToNumber(input);
                    
                    //if we can't transfer
                    if (userValue == -1)
                    {
                        //write notification and ask to rewrite
                        System.out.println("Write appropriate name " +
                                "of gesture, e.g. paper: ");
                        input = scan.nextLine();
                        System.out.println();
                    }
                } while (userValue == -1);
                
                //if we ok with transfering to right number, then we go here
                //and compare user gesture and machine gesture
                int result = result(machineValue, userValue);
                
                //if comparison result is 1 - user wins
                if (result == 1)
                {
                    System.out.println("You win!");
                    wins++;
                }
                //if comparison result is 0 - machine wins
                else if (result == 0)
                {
                    System.out.println("You lose.");
                    losses++;
                }
                //if comparison result is 2 - tie
                else if (result == 2)
                {
                    System.out.println("It's a tie");
                    ties++;
                }
            }
        }
        
        System.out.println();
        
        //if we tryed to guess at least once, then
        //print results of guessing
        if (wins != 0 || losses != 0 || ties != 0)
        {
            System.out.println("Number of wins:\t\t" + wins +
                    "\nNumber of losses:\t" + losses +
                    "\nNumber of ties:\t\t" + ties);
        }
    }
    
    /*
     * Method that converts user input in string to a number in format:
     * 2 - rock
     * 1 - scissors
     * 0 - paper
     */
    public static int transferToNumber(String input)
    {
        int value = -1;
        
        if (input.equals("rock") || input.equals("Rock") ||
                input.equals("r") || input.equals("R"))
        {
            value = 2;
        }
        else if (input.equals("scissors") || input.equals("Scissors") || 
                input.equals("s") || input.equals("S"))
        {
            value = 1;
        }
        else if (input.equals("paper") || input.equals("Paper") || 
                input.equals("p") || input.equals("P"))
        {
            value = 0;
        }
        
        return value;
    }
    
    /*
     * Method that checks who wins this round.
     * First finds if there is a tie,
     * then checks if user wins:
     *      if user gesture > machine gesture 
     *          (2 > 1 or 1 > 0 - rocks > scissors or scissors > paper)
     *      or if user gesture is 0 and machine gesture is 2 
     *          (which means that user chose paper, and machine - rock)
     *      then user wins
     * then checks if machine wins:
     *      if machine gesture > user gesture
     *          (2 > 1 or 1 > 0 - rocks > scissors or scissors > paper)
     *      or if machine gesture is 0 and user gesture is 2 
     *          (which means that user chose paper, and machine - rock)
     *      then machine wins
     * 
     * Return result in format:
     * -1 - something went wrong
     * 2 - tie
     * 1 - user wins
     * 0 - machine wins
     */
    public static int result(int machineInput, int userInput)
    {
        int result = -1;
        
        if (machineInput == userInput)
        {
            result = 2;
        }
        else if (userInput > machineInput || (userInput == 0 && machineInput == 2))
        {
            result = 1;
        }
        else if (machineInput > userInput || (machineInput == 0 && userInput == 2))
        {
            result = 0;
        }
        
        return result;
    }
}
