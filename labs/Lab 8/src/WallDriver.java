
import javax.swing.JFrame;


/**
 *
 * @author qlonik
 */
public class WallDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Wall");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new WallPanel(frame));
        
        frame.pack();
        frame.setVisible(true);
    }
}
