
import java.util.Scanner;


/**
 * Main.java Class tests LeapYear check method
 * @author Nikita Volodin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;
        
        do {
            System.out.print("Input a year (-1 to quit): ");
            year = scan.nextInt();
            System.out.println();

            if (year != -1) {
                if (LeapYear.check(year))
                {
                    System.out.println(year + " is a leap");
                } else {
                    System.out.println(year + " is not a leap");
                }
            }
        } while (year != -1);
    }

}
