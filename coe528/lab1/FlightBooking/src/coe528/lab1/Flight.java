/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author bbenoy
 */
public class Flight {
    private int flightNumber,capacity,numberOfSeatsLeft;
    private String origin,destination,departureTime;
    private double originalPrice;
    
    
    public int getflightNumber(){
        return flightNumber;
    }
    
    public void setflightNumber(int flightNumber){
        this.flightNumber= flightNumber;
    }
    
    public int getcapacity(){
        return capacity;
    }
    
    public void setcapacity(int capacity){
        this.capacity= capacity;
    }
    
    public int getnumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    
    public void setnumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft= numberOfSeatsLeft;
    }
    
    public String getorigin(){
        return origin;
    }
    
    public void setorigin(String origin){
        this.origin= origin;
    }
    
    public String getdestination(){
        return destination;
    }
    
    public void setdestination(String destination){
        this.destination= destination;
    }
    
    public String getdepartureTime(){
        return departureTime;
    }
    
    public void setdepartureTime(String departureTime){
        this.departureTime= departureTime;
    }
    
    public double getoriginalPrice(){
        return originalPrice;
    }
    
    public void setoriginalPrice(double originalPrice){
        this.originalPrice= originalPrice;
    }

   
    /**
     *
     * @param flightNumber
     * @param capacity
     * @param origin
     * @param destination
     * @param depatureTime
     * @param orignialPrice
     */
    public Flight(int flightNumber, int capacity, String origin, String destination, String depatureTime, double orignialPrice){
        if (destination.equals(origin)) 
            throw new IllegalArgumentException("Destination cannot be the same as the Origin");
        this.flightNumber = flightNumber;
        this.capacity= capacity;
        this.origin= origin;
        this.destination= destination;
        this.departureTime= departureTime;
        this.originalPrice= originalPrice;
        numberOfSeatsLeft= capacity;
    }
    
    public boolean bookASeat(){
        numberOfSeatsLeft--;
            return(numberOfSeatsLeft>0);
    }
    @Override
    public String toString(){
        return ("Flight "+getflightNumber()+",from "+ getorigin() + " to "+ getdestination()+" leaving at "+getdepartureTime()+" original price:$"+getoriginalPrice());
           }
}
