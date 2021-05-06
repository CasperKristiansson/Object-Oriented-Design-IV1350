package se.kth.iv1350.pos.controller;

import se.kth.iv1350.pos.model.*;
import se.kth.iv1350.pos.integration.*;


public class Controller {
    private Sale sale;
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
    	
    	if(item.getStoreQuantity() >= quantity) {
    		sale.addItem(item, quantity);
    	}else {
    		System.out.println("Out of stock!");
    	}
    	
    	return this.sale.getSaleInformation();
    }
    
    public SaleDTO endSale() {
    	System.out.println("Försäljning avslutad.");
    	eis.update(this.sale);
    	return this.sale.getSaleInformation();
    }
    
    public double pay(double amount, String paymentMethod) {
    	double change = amount - sale.getSaleInformation().getTotalPrice();
    	
    	if(change < 0) {
    		System.out.println("Not enough");
    	}else if(change == 0){
    		System.out.println("No change");
    		this.eas.update(this.sale, amount);
    	}else {
    		System.out.println("Change: " + change);
    		this.eas.update(this.sale, (amount - change));
    	}
    	
    	System.out.println("Store balance: " + this.eas.getStoreBalance());
    	System.out.println("Total VAT: " + sale.getSaleInformation().getTotalVAT());
    	return 0;
    }
    
    public void print() {
    	printer.print(this.sale.getReceipt(sale));
    }
}