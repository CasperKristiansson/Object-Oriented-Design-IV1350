package se.kth.iv1350.pos.controller;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;
import se.kth.iv1350.pos.model.SaleDTO;
import se.kth.iv1350.pos.integration.*;
import se.kth.iv1350.pos.model.*;

public class ControllerTest {
    private Controller contr;
    private Sale sale;
    
    @BeforeEach
    public void setUp() {
        Printer printer = new Printer();
        ExternalAccountingSystemHandler eas = new ExternalAccountingSystemHandler();
        ExternalInventorySystemHandler eis = new ExternalInventorySystemHandler();
        contr = new Controller(printer, eas, eis);
        sale = new Sale();
    }
    
    @AfterEach
    public void tearDownClass() {
    }

    @Test
    public void testStartSale() {
        System.out.println("startSale");
        SaleDTO result = contr.startSale();
    }

    @Test
    public void testEnterItem() {
        //this.itemDTOs.add(new ItemDTO("Karrékotlett med Ben Skivad ca 1kg ICA", 87.90, 12));
        contr.startSale();
        System.out.println("enterItem");
        int itemIdentifier = 1;
        int quantity = 2;
        String expResult = "Karrékotlett med Ben Skivad ca 1kg ICA";
        SaleDTO result = contr.enterItem(itemIdentifier, quantity);
        String resultString = result.getNameOfItems().get(0).getItemDTO().getItemDescription();
        assertEquals(expResult, resultString);
    }

    @Test
    public void testEndSale() {
        System.out.println("endSale");
        Controller instance = null;
        SaleDTO expResult = null;
        SaleDTO result = instance.endSale();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPay() {
        System.out.println("pay");
        double amount = 0.0;
        String paymentMethod = "";
        Controller instance = null;
        double expResult = 0.0;
        double result = instance.pay(amount, paymentMethod);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrint() {
        System.out.println("print");
        Controller instance = null;
        instance.print();
        fail("The test case is a prototype.");
    }
    
}
