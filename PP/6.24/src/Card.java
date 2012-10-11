
import java.util.Random;

/**
 * Card.java
 *
 * @author Nikita Volodin
 *
 * Programming project 6.24 page 299
 *
 * Class that represents standard card
 */
public class Card {

    final private String[] FACE_VALUES = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    final private String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String faceValue, suit;
    Random rnd = new Random();

    public Card() {
        faceValue = FACE_VALUES[rnd.nextInt(FACE_VALUES.length)];
        suit = SUITS[rnd.nextInt(SUITS.length)];
    }

    //method gets face value of a current card
    public String getFaceValue() {
        return faceValue;
    }

    //method gets suit of a current card
    public String getSuit() {
        return suit;
    }

    //method that represents card object as a string
    public String toString() {
        return "Face value: " + faceValue + ",\tsuit: " + suit;
    }
}
