/**
 * FlipRace.java        Author: Nikita Volodin
 * Programming project 5.6 page 264
 * 
 * FlipRace - flips 2 coins and looks which one first do three heads in a row
 */
public class FlipRace
{
    public static void main(String[] args)
    {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        
        int headsInRow1 = 0, headsInRow2 = 0, totalFlip = 0;
        
        while (headsInRow1 != 3 && headsInRow2 != 3)
        {
            coin1.flip();
            coin2.flip();
            totalFlip++;
            
            System.out.println("Flip " + totalFlip + "\t----------------------------------------------");
            //if first coin is heads now
            if (coin1.isHeads())
            {
                System.out.println("First coin is a heads");
                headsInRow1++;
            }
            else
            {
                System.out.println("First coin is a tails");
                headsInRow1 = 0;
            }
            
            //if second coin is heads now
            if (coin2.isHeads())
            {
                System.out.println("Second coin is a heads");
                headsInRow2++;
            }
            else
            {
                System.out.println("Second coin is a tails");
                headsInRow2 = 0;
            }
            
            System.out.println();
        }
        
        System.out.println("------------------------------------------------------");
        if (headsInRow1 == 3 && headsInRow2 == 3)
        {
            System.out.println("Both coins got 3 heads in a row. It took " + 
                    totalFlip + " flips.");
        }
        else if (headsInRow1 == 3)
        {
            System.out.println("First coin got 3 heads in a row before second. " + 
                    "It took " + totalFlip + " flips.");
        }
        else if (headsInRow2 == 3)
        {
            System.out.println("Second coin got 3 heads in a row before first. " + 
                    "It took " + totalFlip + " flips.");
        }
    }

}
