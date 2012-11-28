
/**
 * DeckOfCards.java     Author: Nikita Volodin (127196)
 * CS151A,              Assignment 8 - Problem #2
 *
 * This class represents standard deck of 52 cards
 */
import java.util.Random;

public class DeckOfCards {
    //array of 52 cards

    Card[] deck = new Card[52];
    //number of used cards in deck
    int usedCards;

    /**
     * Creates deck of 52 unique cards (one standard deck)
     */
    public DeckOfCards() {
        for (int i = 0; i < Card.SUITS.length; i++) {
            for (int j = 0; j < Card.FACE_VALUES.length; j++) {
                deck[13 * i + j] = new Card(i, j);
            }
        }
        usedCards = 0;
    }

    /**
     * Shuffle the deck
     */
    public void shuffle() {
        for (int i = 0; i < 10000; i++) {
            Random rnd = new Random();
            int card1 = rnd.nextInt(52);
            int card2 = rnd.nextInt(52);
            swap(card1, card2);
        }
    }

    /**
     * Method changes @param card1 and @param card2 in the deck
     * 
     * @param card1 Number of first card to change
     * @param card2 Number of second card to change
     */
    private void swap(int card1, int card2) {
        Card tmp;
        tmp = deck[card1];
        deck[card1] = deck[card2];
        deck[card2] = tmp;
    }

    /**
     * Returns first not null card in array and delete it from a deck
     *
     * @return First not null Card
     */
    public Card pop() {
        int i = 0;
        while ((i < deck.length) && (deck[i] == null)) {
            i++;
        }
        Card tmp = deck[i];
        deck[i] = null;
        usedCards++;
        return tmp;
    }

    /**
     * Returns first not null card in array and do not delete it
     *
     * @return First not null Card
     */
    public Card peek() {
        int i = 0;
        while ((i < deck.length) && (deck[i] == null)) {
            i++;
        }
        return deck[i];
    }

    /**
     * Method returns number of cards left in a deck
     *
     * @return number of cards left in a deck
     */
    public int getUsedCards() {
        return deck.length - usedCards;
    }
}
