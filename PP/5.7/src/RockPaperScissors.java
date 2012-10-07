
import java.util.Random;
import java.util.Scanner;

/**
 * RockPaperScissors.java
 * @author Nikita Volodin
 * 
 * Programming project 5.7 page 264
 * 
 * Application that emulates game rock paper scissors
 * 2 - rock
 * 1 - scissors
 * 0 - paper
 */

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        String input = "";
        int wins = 0, losses = 0, ties = 0, userValue, machineValue;
        
        //while user don't input q (quit) we play
        while (!input.equals("q"))
        {
            System.out.print("Write your gesture (q for quit): ");
            input = scan.nextLine();
            System.out.println();
            
            if (!input.equals("q"))
            {
                machineValue = rnd.nextInt(3);
                do
                {
                    userValue = transferToNumber(input);
                    if (userValue == -1)
                    {
                        System.out.println("Write appropriate name of gesture, e.g. paper: ");
                        input = scan.nextLine();
                        System.out.println();
                    }
                } while (userValue == -1);
                
                int result = result(machineValue, userValue);

                if (result == 1)
                {
                    System.out.println("You win!");
                    wins++;
                }
                else if (result == 0)
                {
                    System.out.println("You lose.");
                    losses++;
                }
                else if (result == 2)
                {
                    System.out.println("It's a tie");
                    ties++;
                }
            }
        }
        
        System.out.println();
         
        if (wins != 0 || losses != 0 || ties != 0)
        {
            System.out.println("Number of wins:\t\t" + wins +
                    "\nNumber of losses:\t" + losses +
                    "\nNumber of ties:\t\t" + ties);
        }
    }
    
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
