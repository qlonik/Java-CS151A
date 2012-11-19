
import java.util.*;

public class CalcSolver {
    //#TODO check if there is 'negative' numbers (that ones that starts with minus sign)
    
    private String expression;
    private ArrayList<String> postfix;
    private int solution;

    public CalcSolver(String inputExpression) {
        expression = inputExpression;
        sanitize();
        getPostfixNotation();
        calc();
    }

    public int getSolution() {
        return solution;
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
        return (input.equals("+") || input.equals("-") ||
                input.equals("*") || input.equals("/") || input.equals("^"));
    }

    private boolean isLeftAssociative(String input) {
        return (input.equals("+") || input.equals("-") ||
                input.equals("*") || input.equals("/"));
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

    private void sanitize() {
        //if expression starts with negative number
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
    }

    private void getPostfixNotation() {
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
        postfix = result;
    }

    private void calc() throws ArithmeticException {
        Stack<Integer> calculatingStack = new Stack<>();

        for (int i = 0; i < postfix.size(); i++) {
            String token = postfix.get(i);
            if (isNumber(token)) {
                calculatingStack.add(Integer.parseInt(token));
            } else if (isOperator(token)) {
                int secondOperand = calculatingStack.pop();
                int firstOperand = calculatingStack.pop();
                switch (token) {
                    case "+":
                        calculatingStack.add(firstOperand + secondOperand);
                        break;
                    case "-":
                        calculatingStack.add(firstOperand - secondOperand);
                        break;
                    case "*":
                        calculatingStack.add(firstOperand * secondOperand);
                        break;
                    case "/":
                        calculatingStack.add(firstOperand / secondOperand);
                        break;
                    case "^":
                        calculatingStack.add((int) Math.pow(firstOperand, secondOperand));
                        break;
                }
            }
        }
        solution = calculatingStack.pop();
    }
}
