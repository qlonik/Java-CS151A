
import java.awt.Dimension;
import javax.swing.JFrame;

/*
 * Calc.java      Author: Nikita Volodin (127196)
 * CS151A,          Assignment 7 - Problem #2
 * 
 * This class draws a JFrame of calculator and add panel with calculator
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame calc = new JFrame("Calculator");
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setPreferredSize(new Dimension(300, 300));
        calc.setMinimumSize(new Dimension(300, 300));

        CalcPanel myPanel = new CalcPanel();
        calc.getContentPane().add(myPanel);

        calc.pack();
        calc.setVisible(true);
    }
}