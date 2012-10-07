/**
 * CountFlips.java
 * @author Nikita Volodin
 * 
 * Programming project 6.6 page 296
 * 
 * class flips coin 100 times and counts how many each side appears
 */
public class CountFlips
{
    public static void main(String[] args)
    {
        Coin coin = new Coin();
        int heads = 0, tails = 0;
        
        for (int i = 0; i < 100; i++)
        {
            coin.flip();
            if (coin.isHeads())
            {
                heads++;
            }
            else
            {
                tails++;
            }
        }
        
        System.out.println("Heads: " + heads + "\nTails: " + tails);
    }
}
