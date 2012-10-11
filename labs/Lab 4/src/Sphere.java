
/**
 * Sphere.java
 *
 * @author Nikita Volodin
 *
 * Lab 4
 *
 * This class represents object sphere
 */
public class Sphere {

    private double radius; //typed in by user

    //constructor
    public Sphere(double inputRadius) {
        radius = inputRadius;
    }

    //get sphere radius
    public double getRadius() {
        return radius;
    }

    //set sphere radius
    public void setRadius(double inputRadius) {
        radius = inputRadius;
    }
    
    //method returns volume of sphere with radius
    public double getVolume() {
        return 4d / 3d * Math.PI * radius;
    }

    //texutal description of class
    public String toString() {
        return "The volume of this sphere is: " + getVolume();
    }
}