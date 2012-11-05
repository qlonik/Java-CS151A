
import java.awt.*;
import java.util.Random;
import javax.swing.JApplet;

/**
 * Fence.java       Author: Nikita Volodin (127196)
 * CS151A,          Assignment 6 - Problem #1
 * 
 * This program draw a fence in the middle of an applet
 */
public class Fence extends JApplet {

    //fence properties
    private final int WIDE = 25;
    private final int HIGH = 300;
    private final int GAP = 20;
    private int numberOfPickets;

    /**
     * Method that draw fence. It called by system (as main)
     *
     * @param page inputed by system
     */
    public void paint(Graphics page) {
        //searching for a number of pickets if 11 is not fit
        //we have formula: width = numberOfPickets * (WIDE + GAP) - GAP
        //find out numberOfPickets: numberOfPickets: (width + GAP) / (WIDE + GAP)
        int pickets = (getWidth() + GAP) / (WIDE + GAP);
        if (pickets < 11) {
            numberOfPickets = pickets;
        } else {
            numberOfPickets = 11;
        }

        int topLeftX = getTopLeftX(), topLeftY = getTopLeftY();

        Random rnd = new Random();
        Color color;

        for (int i = 0; i < numberOfPickets; i++) {
            color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            page.setColor(color);
            page.fillRect(topLeftX + (WIDE + GAP) * i, topLeftY, WIDE, HIGH);
            page.setColor(Color.black);
            page.drawRect(topLeftX + (WIDE + GAP) * i, topLeftY, WIDE, HIGH);
        }

        //first horiz picket
        color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        page.setColor(color);
        page.fillRect(topLeftX, topLeftY + 20, numberOfPickets * (WIDE + GAP) - GAP, WIDE);
        page.setColor(Color.black);
        page.drawRect(topLeftX, topLeftY + 20, numberOfPickets * (WIDE + GAP) - GAP, WIDE);

        //second horiz picket
        color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        page.setColor(color);
        page.fillRect(topLeftX, topLeftY + (HIGH - WIDE - 20), numberOfPickets * (WIDE + GAP) - GAP, WIDE);
        page.setColor(Color.black);
        page.drawRect(topLeftX, topLeftY + (HIGH - WIDE - 20), numberOfPickets * (WIDE + GAP) - GAP, WIDE);
    }

    /**
     * method returns top left X coordinate so image will be in center
     *
     * @return X coord
     */
    private int getTopLeftX() {
        return (getWidth() - (numberOfPickets * (WIDE + GAP) - GAP)) / 2;
    }

    /**
     * method returns top left Y coord so image will be in center
     *
     * @return Y coord
     */
    private int getTopLeftY() {
        return (getHeight() - HIGH) / 2;
    }
}
