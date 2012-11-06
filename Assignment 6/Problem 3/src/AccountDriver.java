
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * AccountDriver.java       Author: Nikita Volodin (127196)
 * CS151A,          Assignment 6 - Problem #3
 * 
 * This is a driver class for a program. This program creates a frame with text field,
 * button and 2 labels. Names of people input using text field. Button is to
 * show a sum of money of two groups of people. And at the same time program
 * prints output with names and money to stdout
 */
public class AccountDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Accounts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 150));
        
        frame.getContentPane().add(new AccountPanel());
        
        frame.pack();
        frame.setVisible(true);
    }
}
