
/**
 * LeapYear.java Class checks if year is a leap
 * @author Nikita Volodin
 */
public class LeapYear {
    public static boolean check(int year) {
        return (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && year % 3200 != 0) || 
                year % 12800 == 0;
    }

}
