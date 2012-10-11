
import java.text.DecimalFormat;

/**
 * SquarePyramid.java
 * @author Nikita Volodin
 * 
 * Lab 4
 * 
 * This class represents square based pyramid
 */
public class SquarePyramid
{
    
    private double side, heigth; //typed in by user

    //constructor
    public SquarePyramid(double inputSide, double inputHeigth) {
        side = inputSide;
        heigth = inputHeigth;
    }
    
    //getters for data
    public double getSide() {
        return side;
    }
    
    public double getHeigth() {
        return heigth;
    }
    
    //method returns volume of pyramid of side and heigth
    public double getVolume() {
        return 1d /3d * Math.pow(side, 2) * heigth;
    }
    
    //setters for side and heigth
    public void setSide(double inputSide) {
        side = inputSide;
    }
    
    public void setHeigth(double inputHeigth) {
        heigth = inputHeigth;
    }
    
    //textual description of a class
    public String toString() {
        return "The volume of this Square-based Pyramid is: " + getVolume();
    }
}
