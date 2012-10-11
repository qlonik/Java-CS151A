
/**
 * Ellipsoid.java
 * @author Nikita Volodin
 * 
 * Lab 4
 * 
 * Class represents ellipsoid
 */
public class Ellipsoid
{
    
    private double firstAxis, secondAxis, thirdAxis; //typed in by user
    
    //constructor
    public Ellipsoid(double inputFirstAxis, double inputSecondAxis, double inputThirdAxis) {
        firstAxis = inputFirstAxis;
        secondAxis = inputSecondAxis;
        thirdAxis = inputThirdAxis;
    }
    
    //getters for data
    public double getFirstAxis() {
        return firstAxis;
    }
    
    public double getSecondAxis() {
        return secondAxis;
    }
    
    public double getThirdAxis() {
        return thirdAxis;
    }
    
    //method returns volume of ellipsoid
    public double getVolume() {
        return 4d / 3d * Math.PI * firstAxis * secondAxis * thirdAxis;
    }
    
    //setters
    public void setFirstAxis(double inputFirstAxis) {
        firstAxis = inputFirstAxis;
    }
    
    public void setSecondAxis(double inputSecondAxis) {
        secondAxis = inputSecondAxis;
    }
    
    public void setThirdAxis(double inputThirdAxis) {
        thirdAxis = inputThirdAxis;
    }
    
    //textual representation of class
    public String toString() {
        return "The volume of this Ellipsoid is: " + 
                getVolume();
    }
}
