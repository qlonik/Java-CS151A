/**
 * Main.java
 * @author user
 * 
 * Programming project 6.5 page 296
 * 
 * Using class PairOfDice.class design app that roll pair 1000 times
 * and counts the number of two sixes that occur.
 */

public class Main
{
    public static void main(String[] args)
    {
        PairOfDice pair = new PairOfDice();
        int counter = 0;
        
        for (int i = 0; i < 1000; i++)
        {
            pair.rollDices();
            if (pair.getFaceValueDie1() == 6 && pair.getFaceValueDie2() == 6)
            {
                counter++;
            }
        }
        
        System.out.println("Two sixes was " + counter + " times.");
    }
}
