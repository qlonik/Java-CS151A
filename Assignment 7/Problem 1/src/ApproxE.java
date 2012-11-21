/*
 * ApproxE.java      Author: Nikita Volodin (127196)
 * CS151A,          Assignment 7 - Problem #1
 * 
 * This program calculates value of constant e with accuracy
 * up to epsilon
 */
public class ApproxE {
    public ApproxE() {
    }
    
    /**
     * Method calculates value of e with approximation to @param epsilon
     * 
     * @param epsilon approximation of calculation
     */
    public void calc(double epsilon) {
        double approxEPrev = 0;
        double approxE = 0;
        int k = 0;
        while (Math.abs(approxE - approxEPrev) > epsilon || approxE == 0) {
            approxEPrev = approxE;
            approxE += 1.0 / factorial(k);
            System.out.println("e = " + approxE);
            k++;
        }
    }
    
    /**
     * Method calculates factorial of number @param n
     * 
     * @param n The number which factorial we want to find
     * @return Factorial of number @param n
     */
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String [] args) {
        ApproxE approx = new ApproxE();
        approx.calc(0.00000001); // 8 digits accuracy
    }
}