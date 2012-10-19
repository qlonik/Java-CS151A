
import java.util.Scanner;


/**
 * InSegment.java Returns all leap year in segment
 * @author Nikita Volodin
 */
public class InSegment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startYear, endYear;
        
        System.out.print("Input the start year: ");
        startYear = scan.nextInt();
        System.out.println();
        System.out.print("Input the end year: ");
        endYear = scan.nextInt();
        System.out.println();
        
        if (endYear < startYear) {
            System.out.println("End year must be greater than start year");
        } else {
            System.out.println("Leap years:");
            for (int i = startYear; i <= endYear; i++) {
                if (LeapYear.check(i)) {
                    System.out.println(i);
                }
            }
        }
    }

}
