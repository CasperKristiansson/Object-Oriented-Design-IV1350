/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.pos.integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.kth.iv1350.pos.model.Sale;

/**
 *
 * @author myfre
 */
public class ExternalAccountingSystemHandlerTest {
    private ExternalAccountingSystemHandler eas;
    public ExternalAccountingSystemHandlerTest() {
        eas = new ExternalAccountingSystemHandler();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of update method, of class ExternalAccountingSystemHandler.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        eas.update(100);
        double expResult = 200;
        double result = eas.getStoreBalance();
        try{
            assertEquals(expResult, result);
        }catch(AssertionError e){
            System.out.println("Expected result did not equal result." + 
                                " Expected result: " + expResult + " Result: " + result);
            assertEquals(expResult, result);
        }
    }  
}
