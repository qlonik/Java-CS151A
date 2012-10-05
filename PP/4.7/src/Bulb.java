/*
 * Bulb.java        Author: Nikita Volodin
 * Programming project 4.7 page 202
 * 
 * Bulb - class that represents light bulb
 */

public class Bulb {
    private boolean state;
    
    //construcor
    public Bulb(boolean initState) {
        state = initState;
    }
    
    public void changeState() {
        if (state) {
            state = false;
        }
        else {
            state = true;
        }
    }
    
    public String toString() {
        if (state) {
            return "turned on";
        }
        else {
            return "turned off";
        }
    }
}