
/**
 * DeckOfCards.java
 *
 * @author Nikita Volodin
 *
 * Programming project 6.24 page 299
 *
 * This class represents deck of 52 standard cards
 */
public class DeckOfCards {

    private final int SIZE_OF_DECK = 52;
    private Card[] deck = new Card[SIZE_OF_DECK];

    //constructor
    public DeckOfCards() {
        int pos = 0;

        for (int faceValue = 0; faceValue < Card.getFACE_VALUES().length; faceValue++) {
            for (int suit = 0; suit < Card.getSUITS().length; suit++) {
                deck[pos] = new Card(Card.getFACE_VALUES()[faceValue], Card.getSUITS()[suit]);
                pos++;
            }
        }
    }

    //get size of a deck
    public int getSizeOfDeck() {
        return SIZE_OF_DECK;
    }

    //get all array of cards
    public Card[] getCards() {
        return deck;
    }

    //get card at the position
    public Card getCard(int position) {
        return deck[position];
    }

    //get face value of the card at position
    public String getFaceValue(int position) {
        return deck[position].getFaceValue();
    }

    //get suit of the card at position
    public String getSuit(int position) {
        return deck[position].getSuit();
    }
    
    //method prints face value and suit of a card in a string format
    public String toString(int position) {
        return ("Face value:\t" + deck[position].getFaceValue() + 
                ",\tSuit:\t" + deck[position].getSuit());
    }
}