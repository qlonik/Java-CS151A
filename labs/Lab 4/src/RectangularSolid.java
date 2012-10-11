
/**
 * RectangularSolid.java
 * @author Nikita Volodin
 * 
 * Lab 4
 * 
 * Class represents rectangular solid
 */
public class RectangularSolid
{
    
    private double length, width, heigth; //typed in by user

    //constructor
    public RectangularSolid(double inputLength, double inputWidth, double inputHeigth) {
        length = inputLength;
        width = inputWidth;
        heigth = inputHeigth;
    }
    
    //getters
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeigth() {
        return heigth;
    }
        
    //method returns volume
    public double getVolume () {
        return length * width * heigth;
    }
    
    //setters for length, width, and heigth
    public void setLength(double inputLength) {
        length = inputLength;
    }
    
    public void setWidth(double inputWidth) {
        width = inputWidth;
    }
    
    public void setHeigth(double inputHeigth) {
        heigth = inputHeigth;
    }
    
    //textual description of a class
    public String toString() {
        return "The volume of this Rectangular Solid is: " + 
                getVolume();
    }
}
