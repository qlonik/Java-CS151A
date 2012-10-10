/**
 * FlightTest.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 3 - Problem #1
 * Programming project 4.6 page 202
 * 
 * This class initiates and updates some Flight objects
 */

import java.util.Scanner;

public class FlightTest
{
    public static void main(String [] args)
    {
        String airline, number, origin, destination;
        Scanner scan = new Scanner(System.in);
        Flight myFlight;
        
        //reads user input
        System.out.print("Write the name of airline: ");
        airline = scan.nextLine();
        System.out.print("Write the number of plane: ");
        number = scan.nextLine();
        System.out.print("Write the origin city: ");
        origin = scan.nextLine();
        System.out.print("Write the destination city: ");
        destination = scan.nextLine();
        
        myFlight = new Flight(airline, number, origin, destination);
        
        System.out.println(myFlight);
        myFlight.setAirlineName("AirCanada");
        System.out.println(myFlight);
        myFlight.setOriginCity("Montreal");
        myFlight.setDestinationCity("Vancouver");
        System.out.println(myFlight);
        myFlight.setFlightNumber("546");
        System.out.println(myFlight);
    }
}