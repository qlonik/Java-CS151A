/**
 * Box.java     Author: Nikita Volodin
 * Programming project 4.4 page 202
 */

public class Box
{
    private double height, width, depth;
    private boolean fillState; //true if box fully filled with smth; false if empty
    
    //constructor
    public Box(double initHeight, double initWidth, double initDepth)
    {
        height = initHeight;
        width = initWidth;
        depth = initDepth;
        fillState = false;
    }
    
    //getters
    public double getHeight()
    {
        return height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getDepth()
    {
        return depth;
    }
    
    public boolean getFillState()
    {
        return fillState;
    }
    
    //setters
    public void setHeight(double input)
    {
        height = input;
    }
    
    public void setWidth(double input)
    {
        width = input;
    }
    
    public void setDepth(double input)
    {
        depth = input;
    }
    
    public void setFillState(boolean input)
    {
        fillState = input;
    }
    
    public String toString()
    {
        return "Height:\t\t" + height + "\nWidth:\t\t" + width +
                "\nDepth:\t\t" + depth + "\nFill State:\t\t" + fillState + "\n";
    }
}