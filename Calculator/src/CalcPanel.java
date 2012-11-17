
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class CalcPanel extends JPanel {
    JLabel display;
    JPanel inputButtons;
    final String [] BUTTON_NAMES = {"7", "8", "9", "/", "(",
                                  "4", "5", "6", "*", ")",
                                  "1", "2", "3", "-", " ",
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
    
    private boolean isNumber(char input) {
        return (input >= '0' && input <= '9');
    }
    
    private boolean isOperator(char input) {
        return (input == '+' || input == '-' || input == '*' || input == '/' || input == '^');
    }
    
    private boolean isLeftAssociative(char input) {
        return (input == '+' || input == '-' || input == '*' || input == '/');
    }
    
    private int priority(char input) {
        switch (input) {
            case '^':
                return 4;
            case '*':
            case '/':
                return 3;
            case '+':
            case '-':
                return 2;
            default:
                return 0;
        }
    }
    
    private String sanitize(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            if (isOperator(expression.charAt(i))) {
                expression = expression.substring(0, i) + " " + expression.charAt(i)
                        + " " + expression.substring(i + 1); 
                i++;
            } else if (expression.charAt(i) == '(') {
                expression = expression.substring(0, i + 1) + " " + expression.substring(i + 1);
            } else if (expression.charAt(i) == ')') {
                expression = expression.substring(0, i) + " " + expression.substring(i);
                i++;
            }
        }
        
        return expression;
    }
    
    private ArrayList<Character> getPostfixNotation(String expression) {
//        String resultString = ""; //for returning result as string
        ArrayList<Character> result = new ArrayList<>();
        Stack<Character> operators = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++){
            if (expression.charAt(i) != ' ') {
                char token = expression.charAt(i);
                
                if (isNumber(token)) {
//                    resultString += token + " "; //for result as string
                    result.add(token);
                } else if (isOperator(token)) {
                    if (!operators.empty()) {
                        while (!operators.empty() &&
                                (isLeftAssociative(token) ? priority(token) <= priority(operators.peek())
                                                         : priority(token) < priority(operators.peek()))) {
//                            resultString += operators.pop() + " "; //for result as string
                            result.add(operators.pop());
                        }
                    }
                    operators.add(token);
                } else if (token == '(') {
                    operators.add(token);
                } else if (token == ')') {
                    while (!operators.empty() && operators.peek() != '(') {
//                        resultString += operators.pop() + " "; //for result as string
                        result.add(operators.pop());
                    }
                    if (operators.empty()) {
                        System.out.println("somewhere in expression missed opening parentheses");
                        break;
                    }
                    operators.pop();
                } else {
                    System.out.println("is not number and not operator");
                    break;
                }
            }
        }
        
        while (!operators.empty()) {
            if (operators.peek() == '(') {
                System.out.println("somewhere in expression missed closing parentheses");
                break;
            }
//            resultString += operators.pop() + " "; //for result as string
            result.add(operators.pop());
        }
        return result;
    }
    
    private String calc(String expression){
        expression = sanitize(expression);
        ArrayList<Character> postfixNotation = getPostfixNotation(expression);
        Stack<Integer> result = new Stack<>();
        
        for (int i = 0; i < postfixNotation.size(); i++) {
            Character token = postfixNotation.get(i);
            if (isNumber(token)) {
                result.add(Integer.parseInt("" + token));
            } else if (isOperator(token)) {
                int secondOperand = result.pop();
                int firstOperand = result.pop();
                switch (token){
                    case '+':
                        result.add(firstOperand + secondOperand);
                        break;
                    case '-':
                        result.add(firstOperand - secondOperand);
                        break;
                    case '*':
                        result.add(firstOperand * secondOperand);
                        break;
                    case '/':
                        result.add(firstOperand / secondOperand);
                        break;
                    case '^':
                        break;
                }
            }
        }
        return ("" + result.pop());
    }
    
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            
            if (!button.getText().equals("=") &&
                    !button.getText().equals("C") &&
                    !button.getText().equals(" ")) {
                if (toEmpty) {
                    display.setText("");
                    toEmpty = false;
                }
                display.setText(display.getText() + button.getText());
            } else if (button.getText().equals("C")) {
                display.setText("0");
                toEmpty = true;
            } else if (button.getText().equals("=")) {
                String result = calc(display.getText());
                display.setText(result);
                toEmpty = true;
            }
        }
    }
}
