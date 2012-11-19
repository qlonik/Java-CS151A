
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcPanel extends JPanel {
    JLabel display;
    JPanel inputButtons;
    final String [] BUTTON_NAMES = {"7", "8", "9", "/", "(",
                                  "4", "5", "6", "*", ")",
                                  "1", "2", "3", "-", "^",
                                  "0", "C", "=", "+", " "};
    boolean toEmpty;
    
    public CalcPanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.yellow);
        
        //display
        display = new JLabel("0");
        display.setFont(new Font("Calibri", Font.PLAIN, 40));
        display.setHorizontalAlignment(JLabel.RIGHT);
        display.setSize(getWidth(), display.getHeight());
        this.add(display, BorderLayout.NORTH);
        
        //input panel with buttons
        inputButtons = new JPanel(new GridLayout(4, 6));
        
        //listener
        ActionListener listener = new ButtonListener();
        
        //input buttons
        for (int i = 0; i < BUTTON_NAMES.length; i++) {
            JButton button = new JButton(BUTTON_NAMES[i]);
            button.addActionListener(listener);
            inputButtons.add(button);
        }
        this.add(inputButtons, BorderLayout.CENTER);
        
        //logic variables
        toEmpty = true;
    }

    private boolean isDigit(String input) {
        return (input.charAt(0) >= '0' && input.charAt(0) <= '9');
    }
    
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            
            if (!button.getText().equals("=") &&
                    !button.getText().equals("C") &&
                    !button.getText().equals(" ")) {
                if (toEmpty) {
                    if (isDigit(button.getText()) || display.getText().equals("0")) {
                        display.setText("");
                    }
                    toEmpty = false;
                }
                display.setText(display.getText() + button.getText());
            } else if (button.getText().equals("C")) {
                display.setText("0");
                toEmpty = true;
            } else if (button.getText().equals("=")) {
                String result;
                try {
                    CalcSolver solver = new CalcSolver(display.getText());
                    int solution = solver.getSolution();
                    result = String.valueOf(solution);
                } catch (ArithmeticException exception) {
                    System.out.println("Arithmetic Error: " + exception);
                    result = "err";
                }
                display.setText(result);
                toEmpty = true;
            }
        }
    }
}
