package se.kth.iv1350.pos.model;

import se.kth.iv1350.pos.integration.*;
import se.kth.iv1350.pos.model.*;
import se.kth.iv1350.pos.controller.Controller;
import java.time.*;
import java.util.*;

public class Sale {
	private LocalTime time; 
    private SaleDTO saleInformation; //Information about sale
    private Receipt receipt;
    private List<Item> items; //Customers items
	private List<Integer> customerItemsQuantity = new ArrayList<>(); //An array with the quantity of customers items

    public Sale () {
    	this.time = LocalTime.now();
    	this.items = new ArrayList<>();
    	this.saleInformation = new SaleDTO(time, "Gittans Livs", 0,  0, 0, null);
    	this.receipt = new Receipt(this.saleInformation);
    }
    
    public List<Item> getItems() {
    	return this.items;
    }
    
    public List<Integer> getCustomerItemsQuantity(){
    	return this.customerItemsQuantity;
    }
    
    public SaleDTO getSaleInformation() {
        return this.saleInformation;
    }
    
    public void addItem(Item item, int quantity) {
       	
    	this.saleInformation.updateTotalVAT(item.getItemDTO().getVAT(), quantity);
    	this.saleInformation.updateTotalPrice(item.getItemDTO().getPrice(), quantity, item.getItemDTO().getVAT()); //Updates the total price
    	System.out.println("Running total: " + this.saleInformation.getTotalPrice());
    	System.out.println(item.getItemDTO().getItemDescription() + ", Price: " + item.getItemDTO().getPrice());
    	
    	boolean found = false;
    	for(Item currentItem : items) {
    		if(currentItem == item) {    //IF DUPLICATES
    			found = true;
    			duplicateItem(currentItem, quantity);
    		}
    	}
    	customerItemsQuantity.add(quantity);
    	if(found == false) {
    		items.add(item);
    	}
    }
    
    public void duplicateItem(Item currentItem, int quantity) {
		customerItemsQuantity.set(items.indexOf(currentItem), (customerItemsQuantity.get(items.indexOf(currentItem)) + quantity));
    }
    
    public Receipt getReceipt(Sale sale) {
    	return receipt;
    }
    
    public void applyDiscount(double amount) {
        
    }
}
