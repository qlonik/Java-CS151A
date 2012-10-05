/*
 * Lights.java      Author: Nikita Volodin
 * Programming project 4.7 page 203
 * 
 * Lights - class that creates few lighting bulbs and chages its states
 */

public class Lights {
    public static void main(String [] args){
        Bulb lighting1 = new Bulb(false);
        Bulb lighting2 = new Bulb(true);
        
        System.out.println("Bulb 1: " + lighting1 + " Bulb 2: " + lighting2);
        
        lighting1.changeState();
        System.out.println("Bulb 1: " + lighting1 + " Bulb 2: " + lighting2);
    }
}