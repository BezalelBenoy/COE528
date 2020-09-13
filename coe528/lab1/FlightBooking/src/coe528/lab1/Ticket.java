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
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int number=0;
    private static int numberofTickets=0;
    
    public Ticket(Passenger p. Flight flight, double price){
    
    passenger=p;
    this.flight=flight;
    this.price= price;
    numberofTickets++;
    number= numberofTickets;
    
}
}
