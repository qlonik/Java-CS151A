
import java.awt.*;
import javax.swing.JFrame;

/**
 * Driver.java
 * @author qlonik
 */
public class Driver {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Launch Control System");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350, 150));
        frame.getContentPane().add(new LaunchControlPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
