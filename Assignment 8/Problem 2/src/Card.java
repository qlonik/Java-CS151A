
/**
 * Card.java        Author: Nikita Volodin (127196)
 * CS151A,          Assignment 8 - Problem #2
 *
 * Class represents a card in standard 52 card deck
 */
import java.util.Random;

public class Card implements Comparable<Card> {

    static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static final String[] FACE_VALUES = {"Two", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private int suit, faceValue;

    /**
     * Generates random card
     */
    public Card() {
        Random rnd = new Random();
        suit = rnd.nextInt(4);
        faceValue = rnd.nextInt(13);
    }

    /**
     * Creates particular card 
     * 
     * @param suit Number of a suit if format: Hearts = 0; Diamonds = 1;
     * Clubs = 2; Spades = 3;
     * @param faceValue Number of a face value of a card
     */
    public Card(int suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    /**
     * Returns name of a suit of particular card
     *
     * @return String representation of a suit number
     */
    public String getSuitName() {
        return SUITS[suit];
    }

    /**
     * Returns name of a face value of particular card
     *
     * @return String representation of a face value
     */
    public String getFaceValueName() {
        return FACE_VALUES[faceValue];
    }

    /**
     *
     * @return Suit as a number
     */
    public int getSuitNumber() {
        return suit;
    }

    /**
     *
     * @return Face value as a number
     */
    public int getFaceValueNumber() {
        return faceValue;
    }

    /**
     * Set value of suit to particular number n
     * 
     * @param n A value of a suit
     */
    public void setSuit(int n) {
        if (n >= 0 && n < 4) {
            suit = n;
        } else {
            System.out.println("This suit number does not exist");
        }
    }

    /**
     * Set value of face value to particular number n
     *
     * @param n A value of face value
     */
    public void setFaceValue(int n) {
        if (n >= 0 && n < 13) {
            faceValue = n;
        } else {
            System.out.println("This face value does not exist");
        }
    }

    /**
     * Compare one card to @param card by face values
     * 
     * @param card Card that we want compare with
     * @return difference between values of faces between cards
     */
    public int compareTo(Card card) {
        return (getFaceValueNumber() - card.getFaceValueNumber());
    }

    /**
     *
     * @return String representation of a card
     */
    public String toString() {
        return (getFaceValueName() + " of " + getSuitName());
    }
}
