
import java.util.Scanner;


/**
 * Pig.java This class games
 * @author qlonik
 */
public class Pig {

    private Player user, machine;
    private PairOfDice dices;

    /**
     * Constructor method
     * It creates two players - user and machine and starts a game
     */
    public Pig() {
        user = new Player();
        machine = new Player();
        dices = new PairOfDice();
        game();
    }

    /**
     * This method represents a game
     */
    private void game() {
        Scanner scan = new Scanner(System.in);
        String userInput;
        
        do {
            //read user input
            //by default it is y
            //if user input nothing consider that he wants default and use default
            System.out.print("Do you want to roll? (Y/n/q): ");
            String input = scan.nextLine();
            System.out.println();
            if (input.equals("")) {
                userInput = "y";
            } else {
                userInput = input;
            }
            
            //while user input value is y
            //it is user's turn
            //if user input value is n it means that it's machine's turn
            while (userInput.equalsIgnoreCase("y")) {
                //roll dices
                dices.roll();
                
                //add both values from dices to point of a current turn
                user.addCurrentTurnPoints(dices.getValue1() + dices.getValue2());
                
                //if we get '1' or two '1' then drop points for player
                //and change a hand to machine
                if (dices.getValue1() == 1 || dices.getValue2() == 1) {
                    if (dices.getValue1() == dices.getValue2()) {
                        System.out.println("You rolled two 1s. You lose all of your points and your hand");
                        user.dropPoints(true);
                        userInput = "n";
                    } else {
                        System.out.println("You rolled 1. You lose current points and your hand");
                        user.dropPoints(false);
                        userInput = "n";
                    }
                }
                
                //if hand is still user's then show result and ask for a next roll of dices
                if (userInput.equalsIgnoreCase("y")){
                    System.out.println("So far you have all points: " + user.getAllPoints() +
                            " and points at current turn: " + user.getPointsCurrentTurn());
                    System.out.println("So far your enemy has all points: " + machine.getAllPoints());
                    System.out.print("Do you want to roll? (Y/n/q): ");
                    input = scan.nextLine();
                    System.out.println();
                    if (input.equals("")) {
                        userInput = "y";
                    } else {
                        userInput = input;
                    }
                }
            }
            //if user asks to stop rolling then adding points from current turn to all points
            //but if we dropped point of user we will add "0"
            user.addPoints(user.getPointsCurrentTurn());
            
            //while turn is 'n' (machine's) and points of machine for current turn less than 20
            while (userInput.equalsIgnoreCase("n") && machine.getPointsCurrentTurn() < 20) {
                //roll dices
                dices.roll();
                
                //add dices' values to current points of machine
                machine.addCurrentTurnPoints(dices.getValue1() + dices.getValue2());
                
                //check if there is not '1' value on any dice
                //if there is then drop points and change turn
                if (dices.getValue1() == 1 || dices.getValue2() == 1) {
                    if (dices.getValue1() == dices.getValue2()) {
                        System.out.println("Machine rolled two 1s. It loses all its points and its hand");
                        machine.dropPoints(true);
                        userInput = "y";
                    } else {
                        System.out.println("Machine rolled 1. It loses current points and its hand");
                        machine.dropPoints(false);
                        userInput = "y";
                    }
                }
            }
            //if machine got points for current turn more than 20
            //then it stores these points
            machine.addPoints(machine.getPointsCurrentTurn());
            
            //if no one won we print results again
            if (user.getAllPoints() < 100 && machine.getAllPoints() < 100) {
                System.out.println("So far you have all points: " + user.getAllPoints() +
                        " and points at current turn: " + user.getPointsCurrentTurn());
                System.out.println("So far your enemy has all points: " + machine.getAllPoints());
            }
        } while (!userInput.equals("q") && user.getAllPoints() < 100 && machine.getAllPoints() < 100);
        
        System.out.println();
        
        //if someone won then print results and points
        if (user.getAllPoints() >= 100) {
            System.out.println("You win with " + user.getAllPoints() + " points");
            System.out.println("Your enemy has " + machine.getAllPoints() + " points");
        } else if (machine.getAllPoints() >= 100) {
            System.out.println("You lose");
            System.out.println("You have " + user.getAllPoints() + " points");
            System.out.println("Your enemy has " + machine.getAllPoints() + " points");
        }
    }
}
