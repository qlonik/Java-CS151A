
/**
 * Main.java
 *
 * @author Nikita Volodin
 *
 * Programming project 6.24 page 299
 *
 * Class that creates 5 random numbers and shows them
 */
public class Main {

    public static void main(String[] args) {
        //create new array of 5 cards
        Card[] cardsArr = new Card[5];

        for (int pos = 0; pos < 5; pos++) {
            //generates card in array at position 'pos'
            cardsArr[pos] = new Card();

            int i = 0;
            while (i < pos) //Chech all cards that was generated before current
            //where 'pos' - position of current card, 'i' - previous cards
            {
                //if we found that face value AND suit matches with the previous card
                //we assume that we generate already existing card and we change it
                while (cardsArr[pos].getFaceValue().equals(cardsArr[i].getFaceValue())
                        && cardsArr[pos].getSuit().equals(cardsArr[i].getSuit())) {
                    //we generate a new card at position of 'pos' - last generated card 
                    //and drop counter 'i' to 0 and start checking this 
                    //newly generated card with already existing
                    cardsArr[pos] = new Card();
                    i = 0;
                }
                i++;
            }
        }

        //prints all 5 cards
        for (int pos = 0; pos < 5; pos++) {
            System.out.println("Card #" + (pos + 1) + ": " + cardsArr[pos]);
        }
    }
}
