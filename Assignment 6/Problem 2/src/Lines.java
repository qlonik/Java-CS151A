
import java.awt.*;
import javax.swing.JFrame;

/**
 * Lines.java       Author: Nikita Volodin (127196)
 * CS151A,          Assignment 6 - Problem #2
 * 
 * This is a driver class, that creates frame and panel with lines and shows them
 */
public class Lines {

    /**
     * Main method
     * @param args the command line arguments
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame("Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
        
        frame.getContentPane().add(new LinesPanel());
        
        frame.pack();
        frame.setVisible(true);
    }
}
