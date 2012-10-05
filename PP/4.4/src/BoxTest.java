/**
 * BoxTest.java     Author: Nikita Volodin
 * Programming project 4.4 page 202
 * 
 * BoxTest - class that tests Box class
 */

public class BoxTest
{
    public static void main(String [] args)
    {
        Box box1 = new Box(45, 23.2, 563.3);
        
        System.out.println(box1);
        
        box1.setFillState(true);
        box1.setDepth(34);
        
        System.out.println(box1);
    }
}