//********************************************************************
//  CoinFlip.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an if-else statement.
//********************************************************************

public class CoinFlip {
    //-----------------------------------------------------------------
    //  Creates a Coin object, flips it, and prints the results.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        //creating a coin
        Coin myCoin = new Coin();
        //setting a key
        myCoin.setKey(5678);

        //flip coin and print it when it's unlocked 
        myCoin.flip();
        System.out.println(myCoin);

        //try to lock coin with a wrong key
        myCoin.lock(0000);
        //try to lock coin with a right key
        myCoin.lock(5678);

        //flip and print locked coin
        myCoin.flip();
        System.out.println(myCoin);
        
        //try to unlock coin with wrong key
        myCoin.unlock(0000);
        //try to unlock coin with right key
        myCoin.unlock(5678);

        //flip and print unlocked coin
        myCoin.flip();
        System.out.println(myCoin);
        
        if (myCoin.isHeads()) {
            System.out.println("You win.");
        } else {
            System.out.println("Better luck next time.");
        }
    }
}
