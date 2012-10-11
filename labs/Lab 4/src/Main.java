
/**
 * Main.java
 *
 * @author Nikita Volodin
 *
 * Lab 4
 *
 * Main class that tests figures classes
 */
public class Main {

    public static void main(String[] args) {
        //question 1
        Sphere sphere = new Sphere(3.25);
        RectangularSolid rectangularSolid = new RectangularSolid(4.5, 3.5, 6.0);
        SquarePyramid pyramid = new SquarePyramid(4.5, 9.2);
        Ellipsoid ellipsoid = new Ellipsoid(4.5, 3.5, 6.0);
        
        //question 2
        System.out.println(sphere);
        System.out.println(rectangularSolid);
        System.out.println(pyramid);
        System.out.println(ellipsoid);
        System.out.println("The total volume of all objects: " + 
                (sphere.getVolume() + rectangularSolid.getVolume() + 
                pyramid.getVolume() + ellipsoid.getVolume()));
        
        //question 3
        sphere.setRadius(3.75);
        pyramid.setHeigth(8.7);
        ellipsoid.setSecondAxis(3.2 * ellipsoid.getSecondAxis());
        
        //question 4
        System.out.println("The new value for the ellipsoid's secondary axis is: " + 
                ellipsoid.getSecondAxis());
        
        //question number 5
//        System.out.println(sphere);
//        System.out.println(rectangularSolid);
//        System.out.println(pyramid);
//        System.out.println(ellipsoid);
        System.out.println("The new total volume of all objects: " + 
                (sphere.getVolume() + rectangularSolid.getVolume() + 
                pyramid.getVolume() + ellipsoid.getVolume()));
    }
}
