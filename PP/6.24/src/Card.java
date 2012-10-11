
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

    private static final String[] FACE_VALUES = {"Ace", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String faceValue, suit;
    Random rnd = new Random();

    //constructor that creates random card
    public Card() {
        faceValue = FACE_VALUES[rnd.nextInt(FACE_VALUES.length)];
        suit = SUITS[rnd.nextInt(SUITS.length)];
    }

    //constructor that creates given card
    public Card(String inputFaceValue, String inputSuit) {
        if (inArray(inputFaceValue, FACE_VALUES)) {
            faceValue = inputFaceValue;
        } else {
            System.out.print("Face value has to be one of this: ");
            for (int i = 0; i < FACE_VALUES.length; i++) {
                System.out.print(FACE_VALUES[i] + ", ");
            }
        }
        if (inArray(inputSuit, SUITS)) {
            suit = inputSuit;
        } else {
            System.out.print("Suit has to be one of this: ");
            for (int i = 0; i < SUITS.length; i++) {
                System.out.print(SUITS[i] + ", ");
            }
        }
    }

    //method checks if value in the array
    private boolean inArray(String inputString, String[] inputArray) {
        boolean result = false;
        int pos = 0;

        while (pos < inputArray.length && !result) {
            if (inputString.equals(inputArray[pos])) {
                result = true;
            }
            pos++;
        }

        return result;
    }

    //method gets face value of a current card
    public String getFaceValue() {
        return faceValue;
    }

    //method gets suit of a current card
    public String getSuit() {
        return suit;
    }

    //method returns array of available face values
    public static String[] getFACE_VALUES() {
        return FACE_VALUES;
    }

    //method returns array of available suits
    public static String[] getSUITS() {
        return SUITS;
    }

    //method that represents card object as a string
    public String toString() {
        return "Face value: " + faceValue + ",\tsuit: " + suit;
    }
}
