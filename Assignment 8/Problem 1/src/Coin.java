//********************************************************************
//  Coin.java         Author: Lewis/Loftus
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

public class Coin implements Lockable
{
    private int key;
    private boolean lock;
    
    private final int HEADS= 0;
    private final int TAILS = 1;

    private int face;

    //-----------------------------------------------------------------
    //  Sets up the coin by flipping it initially.
    //-----------------------------------------------------------------
    public Coin ()
    {
        lock = false;
        flip();
    }

    //-----------------------------------------------------------------
    //  Flips the coin by randomly choosing a face value.
    //-----------------------------------------------------------------
    public void flip ()
    {
        if (!lock) {
            face = (int) (Math.random() * 2);
        } else {
            System.out.println("Coin is locked");
        }
    }

    //-----------------------------------------------------------------
    //  Returns true if the current face of the coin is heads.
    //-----------------------------------------------------------------
    public boolean isHeads ()
    {
        if (!lock) {
            return (face == HEADS);
        } else {
            System.out.print("Coin is locked. Returning unrelyable false");
            return false;
        }
    }

    //-----------------------------------------------------------------
    //  Returns the current face of the coin as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        if (!lock) {
            String faceName;

            if (face == HEADS) {
                  faceName = "Heads";
             }
            else {
                  faceName = "Tails";
             }

            return faceName;
        } else {
            return "Coin is locked";
        }
    }

    //Methods for implementation of lockable object
    public void setKey(int key) {
        this.key = key;
    }

    public void lock(int key) {
        if (this.key == key) {
            lock = true;
        } else {
            System.out.println("Wrong key");
        }
    }

    public void unlock(int key) {
        if (this.key == key) {
            lock = false;
        } else {
            System.out.println("Wrong key");
        }
    }

    public boolean locked() {
        return lock;
    }
}