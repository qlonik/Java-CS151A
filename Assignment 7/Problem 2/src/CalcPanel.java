
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalcPanel extends JPanel {

    private JLabel display;
    private JPanel inputButtons;
    private String[] nameOfButtons = {"7", "8", "9", "/",
                                      "4", "5", "6", "*",
                                      "1", "2", "3", "-",
                                      "0", "=", "C", "+"};
    //number entered
    int number;
    //result calculated
    int result;
    //action that we pressed and that will be next to do
    String action, nextAction;
    //true if we need to empty the display
    boolean toEmpty;

    public CalcPanel() {
        this.setLayout(new BorderLayout());

        //display
        display = new JLabel("0");
        display.setFont(new Font("Calibri", Font.PLAIN, 40));
        display.setHorizontalAlignment(JLabel.RIGHT);
        display.setBackground(Color.YELLOW);
        display.setSize(getWidth(), display.getHeight());
        add(display, BorderLayout.NORTH);


        //input buttons
        inputButtons = new JPanel(new GridLayout(4, 4));
        ButtonListener listener = new ButtonListener();
        for (int i = 0; i < nameOfButtons.length; i++) {
            JButton button = new JButton(nameOfButtons[i]);
            button.addActionListener(listener);
            inputButtons.add(button);
        }
        add(inputButtons, BorderLayout.CENTER);

        //start of variables for logic
        number = 0;
        result = 0;
        toEmpty = true;
        nextAction = "";
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            int digit;
            
            //because text on each button is only one letter
            //we get that letter, transferring it into char
            //and check if it a digit
            if (Character.isDigit(button.getText().charAt(0))) {
                //if toEmpty flag is true, then we clear the display and 
                //set flag to false
                if (toEmpty) {
                    toEmpty = false;
                    display.setText("");
                }
                //if pressed number button
                //then we add it to a display and create a number
                //by multiplying by 10 and adding pressed number
                if (Integer.toString(number).length() < 8) {
                    display.setText(display.getText() + button.getText());
                    digit = Integer.parseInt(button.getText());
                    number = number * 10 + digit;
                }
                
                System.out.println("" + number);
            }
            //if pressed other (action) button
            else {
                toEmpty = true;
                action = nextAction;
                //if we entered the first number
                //save it into result witout any calculations
                if (action.equals("")) {
                    result = number;
                }
                nextAction = button.getText();
                if (nextAction.equals("C")) {
                    number = 0;
                    result = 0;
                    action = "";
                    display.setText("0");
//                } else if (nextAction.equals("=")) {

                } else {
                    switch (action) {
                        case "+":
                            result += number;
                            break;
                        case "-":
                            result -= number;
                            break;
                        case "*":
                            result *= number;
                            break;
                        case "/":
                            if (number != 0) {
                                result /= number;
                            }
                            break;
                    }
                    if (action.equals("/") && number == 0) {
                        display.setText("err");
                        result = 0;
                    } else {
                        display.setText("" + result);
                    }
                    number = 0;
                }
            }
        }
    }
}
