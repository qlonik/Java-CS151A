
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * AccountDriver.java
 * @author Nikita Volodin
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
