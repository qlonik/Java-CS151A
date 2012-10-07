/**
 * PairOfDice.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 3 - Problem #2
 * 
 * This class creates 2 dice of Die class (from book), and add methods 
 * to manipulate with each die in pair, to roll both of them and 
 * to find sum of face values
 */

public class PairOfDice
{
    private Die die1, die2;
    
    //constructor
    public PairOfDice()
    {
        die1 = new Die();
        die2 = new Die();
    }
    
    public void rollDices()
    {
        die1.roll();
        die2.roll();
    }
    
    public void rollDie1()
    {
        die1.roll();
    }
    
    public void rollDie2()
    {
        die2.roll();
    }
    
    //setter methods
    public void setFaceValueDie1(int value)
    {
        die1.setFaceValue(value);
    }
    
    public void setFaceValueDie2(int value)
    {
        die2.setFaceValue(value);
    }
    
    //getter methods
    public int getFaceValueDie1()
    {
        return die1.getFaceValue();
    }
    
    public int getFaceValueDie2()
    {
        return die2.getFaceValue();
    }
    
    //summer method
    public int getSum()
    {
        return die1.getFaceValue() + die2.getFaceValue();
    }
    
    //to string method
    public String toString()
    {
        String result = "Face value 1st die: \"" + die1 + 
                "\" and 2nd die: \"" + die2 + "\"";
        
        return result;
    }
}
