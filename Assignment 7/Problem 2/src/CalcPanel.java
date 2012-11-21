
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * CalcPanel.java      Author: Nikita Volodin (127196)
 * CS151A,          Assignment 7 - Problem #2
 * 
 * This class creates calculator panel
 */

class CalcPanel extends JPanel {

    private JLabel display;
    private JPanel inputButtons;
    private final String[] NAME_OF_BUTTONS = {"7", "8", "9", "/",
                                              "4", "5", "6", "*",
                                              "1", "2", "3", "-",
                                              "0", "=", "C", "+"};
    //number entered
    int number;
    //result calculated
    int result;
    //action that we pressed and that will be next to do
    String action;
    //true if we need to empty the display
    boolean toEmpty;

    public CalcPanel() {
        this.setBackground(Color.YELLOW);
        this.setLayout(new BorderLayout());

        //display
        display = new JLabel("0");
        display.setFont(new Font("Calibri", Font.PLAIN, 40));
        display.setHorizontalAlignment(JLabel.RIGHT);
        display.setSize(getWidth(), display.getHeight());
        add(display, BorderLayout.NORTH);


        //input buttons
        inputButtons = new JPanel(new GridLayout(4, 4));
        ButtonListener listener = new ButtonListener();
        for (int i = 0; i < NAME_OF_BUTTONS.length; i++) {
            JButton button = new JButton(NAME_OF_BUTTONS[i]);
            button.addActionListener(listener);
            inputButtons.add(button);
        }
        add(inputButtons, BorderLayout.CENTER);

        //variables for logic
        number = 0;
        result = 0;
        toEmpty = true;
        action = "";
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            
            //because text on each button is only one letter
            //we get that letter, converting it into char
            //and check if it a digit
            if (Character.isDigit(button.getText().charAt(0))) {
                //toEmpty flag is always false while we are pressing digit buttons
                //but becomes true when we press any function button
                //so we empty the display after pressing number button only
                //if before it was pressed function button
                if (toEmpty) {
                    toEmpty = false;
                    display.setText("");
                }
                //when we press any number button and previously was pressed equals
                //sign, then we consider that we start from beginning
                //and emptying action variables
                if (action.equals("=")){
                    action = "";
                }
                
                //allow inserting numbers only up to 6 digits long
                //every press on a digit button add this number to a display
                if (display.getText().length() < 6) {
                    display.setText(display.getText() + button.getText());
                }
            }
            //if pressed other (action) button
            else {
                //when we press an action button, we need to clear display
                //on next hit of digit button
                toEmpty = true;
                //get a number that is currently on display
                number = Integer.parseInt(display.getText());
                //if we entered the first number
                //save it into result witout any calculations
                if (action.equals("")) {
                    result = number;
                }
                //if we press C button then consider that we start from beginning
                if (button.getText().equals("C")) {
                    number = 0;
                    result = 0;
                    action = "";
                    display.setText("0");
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
                    
                    //when we pressed a new action and old one evaluated
                    //and current one is not a Clear, then we store this new action
                    action = button.getText();
                    number = 0;
                }
            }
        }
    }
}
