/**
 * Main.java
 * @author Nikita Volodin
 * 
 * app that produces multiplication table, from 1 to 12
 */
public class Main
{
    public static void main(String[] args)
    {
        for (int row = 1; row <= 12; row++)
        {
            for (int column = 1; column <= 12; column++)
            {
                //we make obj multiplication where is row * column
                //find the length of this number and add few spaces before
                //so full length will be 4
                Integer multiplication = row * column;
                int spaces = 4 - multiplication.toString().length();
                for (int spaceNumber = 0; spaceNumber < spaces; spaceNumber++)
                {
                    System.out.print(" ");
                }
                
                System.out.print(multiplication);
            }
            System.out.println();
        }
    }
}
