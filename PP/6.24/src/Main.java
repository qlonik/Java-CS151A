/**
 * Main.java
 * @author Nikita Volodin
 * 
 * Programming project 6.24 page 299
 * 
 * Class that creates 5 random numbers and shows them
 */
public class Main
{
    public static void main(String[] args)
    {
        Card[] cardsArr = new Card[5];
        
        for (int pos = 0; pos < 5; pos++)
        {
            cardsArr[pos] = new Card();
            
            int i = 0;
            while (i < pos) //< and without (i != pos) check; but <= and with (i != pos) check
            {
                while (cardsArr[pos].getFaceValue().equals(cardsArr[i].getFaceValue()) &&
                        cardsArr[pos].getSuit().equals(cardsArr[i].getSuit()))
                {
                    cardsArr[pos] = new Card();
                    i = 0;
                } //end while
                i++;
            } //end while
        }
        
        for (int pos = 0; pos < 5; pos++)
        {
            System.out.println("Card #" + (pos + 1) + ": " + cardsArr[pos]);
        }
    }
}
