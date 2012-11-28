
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qlonik
 */
public class Integral {

    private double f(Double x) {
//        return (x * x + 2);
        return (2.5 * Math.pow(Math.E, -x) * Math.sin(5 * Math.pow(x, 2.1)) + 1.4);
    }
    
    private double solve(double a, double b, int divisions) {
        double solution = 0;
        double delta = (b - a) / divisions;
        for (int i = 0; i < divisions; i++) {
            solution += delta * (f(a + i * delta) + f(a + (i + 1) * delta)) / 2;
        }
        return solution;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input number of divisions: ");
        int divisions = scan.nextInt();
        System.out.println();
        
        Integral solver = new Integral();
        double result = solver.solve(1, 5, divisions);
        
        System.out.println("Answer: " + result);
    }
}
