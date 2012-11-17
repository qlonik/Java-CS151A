
import java.awt.Dimension;
import javax.swing.JFrame;

public class Driver {
    public static void main(String [] args) {
        JFrame calc = new JFrame("Calculator");
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setPreferredSize(new Dimension(300, 300));
        calc.setMinimumSize(new Dimension(300, 300));
        
        calc.getContentPane().add(new CalcPanel());
        
        calc.pack();
        calc.setVisible(true);
    }
}
