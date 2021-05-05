package se.kth.iv1350.pos.controller;

import se.kth.iv1350.pos.model.*;
import se.kth.iv1350.pos.integration.*;


public class Controller {
    private Sale sale;
    private SaleDTO saleDTO;
    private Printer printer; 
    private ExternalAccountingSystemHandler eas;
    private ExternalInventorySystemHandler eis;
    
    public Controller(Printer printer, ExternalAccountingSystemHandler eas, ExternalInventorySystemHandler eis) {
        this.printer = printer;
        this.eas = eas;
        this.eis = eis;
        eis.addItem(); //Lägger till alla föremål som finns i systemet (mestadels för testning)
    }
    
    //Starta en ny sale där ett objekt av Sale skapas och tillhörande SaleDTO
    public SaleDTO startSale() {
        this.sale = new Sale();
        return sale.getSaleInformation();
    }
    
    public SaleDTO enterItem(int itemIdentifier, int quantity) {
    	Item item = eis.search(itemIdentifier);
    	sale.addItem(item , quantity);
    	return this.sale.getSaleInformation();
    }
    
    public SaleDTO endSale() {
    	System.out.println("Försäljning avslutad.");
    	eis.update(this.sale);
    	System.out.println(eis.test());
    	return this.saleDTO;
    }
}