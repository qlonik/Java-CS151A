
import java.util.*;

public class CalcSolver {
    //#TODO check if there is 'negative' numbers (that ones that starts with minus sign)

    public CalcSolver() {
    }

    private boolean isNumber(String input) {
        boolean result = true;
        for (int i = 0; i < input.length() && result; i++) {
            if (!(input.charAt(i) >= '0' && input.charAt(i) <= '9')) {
                result = false;
            }
        }
        return result;
    }

    private boolean isOperator(String input) {
        return (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/") || input.equals("^"));
    }

    private boolean isLeftAssociative(String input) {
        return (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/"));
    }

    private int priority(String input) {
        if (input.equals("^")) {
            return 4;
        } else if (input.equals("*") || input.equals("/")) {
            return 3;
        } else if (input.equals("+") || input.equals("-")) {
            return 2;
        } else {
            return 0;
        }
    }

    private String sanitize(String expression) {
        //if expression starts from negative number
        if (expression.charAt(0) == '-') {
            expression = "0" + expression;
        }
        for (int i = 0; i < expression.length(); i++) {
            if (isOperator(String.valueOf(expression.charAt(i)))) {
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

    private ArrayList<String> getPostfixNotation(String expression) {
        ArrayList<String> result = new ArrayList<>();
        Stack<String> operators = new Stack<>();
        Scanner line = new Scanner(expression);

        while (line.hasNext()) {
            String token = line.next();
            if (isNumber(token)) {
                result.add(token);
            } else if (isOperator(token)) {
                if (!operators.empty()) {
                    while (!operators.empty()
                            && (isLeftAssociative(token) ? priority(token) <= priority(operators.peek())
                            : priority(token) < priority(operators.peek()))) {
                        result.add(operators.pop());
                    }
                }
                operators.add(token);
            } else if (token.equals("(")) {
                operators.add(token);
            } else if (token.equals(")")) {
                while (!operators.empty() && !operators.peek().equals("(")) {
                    result.add(operators.pop());
                }
                if (operators.empty()) {
                    System.out.println("somewhere in expression missed opening parentheses");
                    break;
                }
                operators.pop();
            } else {
                System.out.println("is not a valid expression");
                break;
            }
        }
        while (!operators.empty()) {
            if (operators.peek().equals("(")) {
                System.out.println("somewhere in expression missed closing parentheses");
                break;
            }
            result.add(operators.pop());
        }
        return result;
    }

    public int calc(String expression) throws ArithmeticException {
        expression = sanitize(expression);
        ArrayList<String> postfixNotation = getPostfixNotation(expression);
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < postfixNotation.size(); i++) {
            String token = postfixNotation.get(i);
            if (isNumber(token)) {
                result.add(Integer.parseInt(token));
            } else if (isOperator(token)) {
                int secondOperand = result.pop();
                int firstOperand = result.pop();
                switch (token) {
                    case "+":
                        result.add(firstOperand + secondOperand);
                        break;
                    case "-":
                        result.add(firstOperand - secondOperand);
                        break;
                    case "*":
                        result.add(firstOperand * secondOperand);
                        break;
                    case "/":
                        result.add(firstOperand / secondOperand);
                        break;
                    case "^":
                        break;
                }
            }
        }
        return result.pop();
    }
}
