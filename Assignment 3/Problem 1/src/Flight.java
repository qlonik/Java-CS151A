/**
 * Flight.java    Author: Nikita Volodin (id: 127196)
 * CS151A,  Assignment 3 - Problem #1
 * 
 * This class is created to describe Flight and some properties: 
 * airline name, number of flight, origin and destination cities
 */

public class Flight
{
    private String airlineName, flightNumber, originCity, destinationCity;
    
    //constructor
    public Flight(String nameOfAirline, String numberOfFlight, String cityFrom, String cityTo)
    {
        airlineName = nameOfAirline;
        flightNumber = numberOfFlight;
        originCity = cityFrom;
        destinationCity = cityTo;
    }
    
    //setter methods
    public void setAirlineName(String name)
    {
        airlineName = name;
    }
    
    public void setFlightNumber(String number)
    {
        flightNumber = number;
    }
    
    public void setOriginCity(String city)
    {
        originCity = city;
    }
    
    public void setDestinationCity(String city)
    {
        destinationCity = city;
    }
    
    //getter methods
    public String getAirlineName()
    {
        return airlineName;
    }
    
    public String getFlightNumber()
    {
        return flightNumber;
    }
    
    public String getOriginCity()
    {
        return originCity;
    }
    
    public String getDestinationCity()
    {
        return destinationCity;
    }
    
    public String toString()
    {
        String output = "Plane: " + flightNumber + " \"" + airlineName + 
                "\". From: " + originCity + ". To: " + destinationCity;
        
        return output;
    }
}