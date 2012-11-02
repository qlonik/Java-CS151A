
import java.util.Random;


/**
 * PairOfDices.java Class represents one pair of dices
 * @author Nikita Volodin
 */
public class PairOfDice {
    
    //face values for each of dices
    private int faceValue1, faceValue2;
    
    //constructor
    public PairOfDice() {
        roll();
    }
    
    /**
     * Method rolls both dices
     */
    public void roll() {
        Random rnd = new Random();
        faceValue1 = rnd.nextInt(6) + 1;
        faceValue2 = rnd.nextInt(6) + 1;
    }
    
    /**
     * Method returns face value of a first die
     * @return Face value of a first die
     */
    public int getValue1() {
        return faceValue1;
    }
    
    /**
     * Method returns face value of a second die
     * @return Face value of a second die
     */
    public int getValue2() {
        return faceValue2;
    }
}
