
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
    
//    //window properties
//    private final int WIDTH_OF_WINDOW = 1000;
//    private final int HEIGHT_OF_WINDOW = 500;

    //fence properties
    private final int WIDE = 25;
    private final int HIGH = 300;
    private final int GAP = 20;
    private final int NUMBER_OF_PICKETS = 11;
    
    /**
     * Method that draw fence. It called by system (as main)
     * @param page inputed by system
     */
    public void paint(Graphics page) {
        int topLeftX = getTopLeftX(), topLeftY = getTopLeftY();
        
        Random rnd = new Random();
        Color color;
//        setSize(new Dimension(WIDTH_OF_WINDOW, HEIGHT_OF_WINDOW));
//        setPreferredSize(new Dimension(WIDTH_OF_WINDOW, HEIGHT_OF_WINDOW));
        
        for (int i = 0; i < NUMBER_OF_PICKETS; i++) {
            color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            page.setColor(color);
            page.fillRect(topLeftX + (WIDE + GAP) * i, topLeftY, WIDE, HIGH);
            page.setColor(Color.black);
            page.drawRect(topLeftX + (WIDE + GAP) * i, topLeftY, WIDE, HIGH);
        }
        
        //first horiz picket
        color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        page.setColor(color);
        page.fillRect(topLeftX, topLeftY + 20, NUMBER_OF_PICKETS * (WIDE + GAP) - GAP, WIDE);
        page.setColor(Color.black);
        page.drawRect(topLeftX, topLeftY + 20, NUMBER_OF_PICKETS * (WIDE + GAP) - GAP, WIDE);
        
        //second horiz picket
        color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        page.setColor(color);
        page.fillRect(topLeftX, topLeftY + (HIGH - WIDE - 20), NUMBER_OF_PICKETS * (WIDE + GAP) - GAP, WIDE);
        page.setColor(Color.black);
        page.drawRect(topLeftX, topLeftY + (HIGH - WIDE - 20), NUMBER_OF_PICKETS * (WIDE + GAP) - GAP, WIDE);
    }
    
    /**
     * method returns top left X coordinate so image will be in center
     * @return X coord
     */
    private int getTopLeftX() {
        return (getWidth() - (NUMBER_OF_PICKETS * (WIDE + GAP) - GAP)) / 2;
    }
    
    /**
     * method returns top left Y coord so image will be in center
     * @return Y coord
     */
    private int getTopLeftY() {
        return (getHeight() - HIGH) / 2;
    }
}
