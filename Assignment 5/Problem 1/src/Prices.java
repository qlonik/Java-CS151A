
import java.util.Scanner;


/**
 * Prices.java      Author: Nikita Volodin (127196)
 * CS151A,          Assignment 5 - Problem #1
 * 
 * This program reads product and price from user until sentinel value
 * and then prints average price, most expensive and cheapest products
 */
public class Prices {
    
    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE; //vars to store max and min prices
        String maxName = "", minName = ""; //vars to store names of max and min products
        int sum = 0, count = 0; //sum of all prices and counter
        
        //read first time from user
        System.out.print("Input a name of a product (q to quit): ");
        String input = scan.nextLine();
        System.out.println();
        
        while (!input.equals("q")) {
            //if user didn't input "q" then ask for a price of a product
            System.out.println("Write the price of a product: ");
            int price = scan.nextInt();
            scan.nextLine();
            
            //add price to all sum and inc count by 1
            sum += price;
            count++;
            
            if (price < min) {
                min = price;
                minName = input;
            }
            if (price > max) {
                max = price;
                maxName = input;
            }
            
            //ask for a name of next product or quit
            System.out.print("Input a name of a product (q to quit): ");
            input = scan.nextLine();
            System.out.println();
        }
        
        //if user input at least one product then show info
        if (count != 0) {
            System.out.println("Average: " + (double) sum / count);
            System.out.println("Most expensive product is " + maxName + " with a price of " + max);
            System.out.println("Cheapest prodct is " + minName + " with a price of " + min);
        }
    }
}
