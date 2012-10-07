/**
 * Stars.java
 * @author Nikita Volodin
 * 
 * Programming project 6.7 page 296
 * 
 * program prints some star patterns
 */
public class Stars
{
    public static void main(String[] args)
    {
        final int MAX_ROWS = 10;
        
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            for (int star = 1; star <= row; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
 
//        int row = 1;
//        while (row <= MAX_ROWS)
//        {
//             int star = 1;
//             while (star <= row)
//             {
//                 System.out.print("*");
//                 star++;
//             }
//             System.out.println();
//             row++;
//        }
        
        System.out.println();
        System.out.println();
        
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            for (int star = MAX_ROWS; star >= row; star--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            for (int space = 1; space <= MAX_ROWS - row; space++)
            {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            for (int space = 1; space <= row - 1; space++)
            {
                System.out.print(" ");
            }
            for (int star = MAX_ROWS; star >= row; star--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
//        System.out.println();
//        System.out.println();
//        
//        for (int row = 1; row <= MAX_ROWS; row += 2)
//        {
//            
//        }
    }
}
