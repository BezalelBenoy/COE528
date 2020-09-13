/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1; 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bbenoy
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @Test
    public void testConstructor() {
       Flight Test1 = new Flight(1000,100,"Toronto","Dubai","17/09/2019 10:00pm",1000);
    }
    
    @Test
    public void testInvalidConstructor() {
        boolean exceptionthrown = false;
        
        try
        {
           Flight Test2= new Flight(1001,101,"Toronto","Toronto","18/09/2019 10:01pm",1001);
        }   
        catch(IllegalArgumentException a)
        {
            exceptionthrown= true;
        }
        assertTrue(exceptionthrown);
    }
    
    @Test
    public void testMethods() {
        Flight Test3 = new Flight(1002,102,"Toronto","Bombay","13/09/2019 10:02pm",1002);
        Test3.bookASeat();
        System.out.println(Test3);
        
        Test3.setflightNumber(2000);
        Test3.setcapacity(200);
        Test3.setorigin("ottawa");
        Test3.setdestination("boston");
        Test3.setdepartureTime("20/10/2019 11:00pm");
        Test3.setoriginalPrice(2000);
        System.out.println(Test3);
        
        System.out.println(Test3.getflightNumber());
        System.out.println(Test3.getcapacity());
        System.out.println(Test3.getorigin());
        System.out.println(Test3.getdestination());
        System.out.println(Test3.getdepartureTime());
        System.out.println(Test3.getoriginalPrice());
        System.out.println(Test3.getnumberOfSeatsLeft());
        
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
