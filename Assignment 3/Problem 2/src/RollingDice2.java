/**
 * RollingDice2.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 3 - Problem #2
 * Programming project 4.8 page 203
 * 
 * This class tests class PairOfDice
 */

public class RollingDice2
{
    public static void main(String[] args)
    {
        PairOfDice pair = new PairOfDice();

        pair.rollDices();
        System.out.println(pair);

        pair.rollDie1();
        System.out.println(pair);

        pair.setFaceValueDie1(3);
        pair.setFaceValueDie2(5);
        System.out.println(pair);
        
        pair.rollDices();
        System.out.println("Sum of face values: " + pair.getSum());
    }
}
