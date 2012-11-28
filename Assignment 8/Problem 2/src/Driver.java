
/**
 * Driver.java        Author: Nikita Volodin (127196)
 * CS151A,          Assignment 8 - Problem #2
 *
 * Class tests DeckOfCard class by dealing 6 cards to 4 players
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeckOfCards myDeck = new DeckOfCards();
        myDeck.shuffle();
        
        String s1 = "Player 1             Player 2             "
                + "Player 3             Player 4";
        String s2 = "";
        for (int i = 0; i < 4 * 20; i++) {
            s2 += "-";
        }
        
        System.out.println(s1);
        System.out.println(s2);
        
        //creating 6 cards for each of 4 players
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                String s = myDeck.pop().toString();
                System.out.print(s);
                for (int k = 0; k < (20 - s.length()); k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
