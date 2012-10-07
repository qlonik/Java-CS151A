
import java.util.Random;

/**
 * Card.java
 * @author Nikita Volodin
 * 
 * Programming project 6.24 page 299
 * 
 * Class that represents standard card
 */

public class Card
{
    final private String[] FACE_VALUES = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    final private String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    
    private String faceValue, suit;
    
    Random rnd = new Random();
    
    public Card()
    {
        faceValue = FACE_VALUES[rnd.nextInt(FACE_VALUES.length)];
        suit = SUITS[rnd.nextInt(SUITS.length)];
    }
    
    public String getFaceValue()
    {
        return faceValue;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public String toString()
    {
        return "Face value: " + faceValue + ", suit: " + suit;
    }
}
