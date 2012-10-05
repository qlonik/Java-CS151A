/**
 * Die.java     Author: Lewis/Loftus
 * 
 * Represents one die (singular of dice) with faces showing values
 * between 1 and 6
 */
public class Die {
    
    private final int MAX = 6; //maximum face value
    
    private int faceValue; //current value showing on he die
    
    //construcor
    public Die()
    {
        faceValue = 1;
    }
    
    //rolls the die and returns the result.
    public int roll()
    {
        faceValue = (int)(Math.random() * MAX) + 1;
        
        return faceValue;
    }
    
    //face value mutator (setter)
    public void setFaceValue(int value)
    {
        faceValue = value;
    }
    
    //face value accessor (getter)
    public int getFaceValue()
    {
        return faceValue;
    }
    
    //returns a string representation of this die
    public String toString()
    {
        String result = Integer.toString(faceValue);
        
        return result;
    }
}
