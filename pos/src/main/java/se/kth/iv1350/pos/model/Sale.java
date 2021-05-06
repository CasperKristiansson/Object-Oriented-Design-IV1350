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
    /**
     * Constructor
     */
    public Sale () {
    	this.time = LocalTime.now();
    	this.items = new ArrayList<>();
    	this.saleInformation = new SaleDTO(time, "Gittans Livs", 0,  0, 0, null);
    	this.receipt = new Receipt(this.saleInformation);
    }
    /**
     * This method returns a list of items.
     * @return List of items.
     */
    public List<Item> getItems() {
    	return this.items;
    }
    /**
     * This method returns a list of quantity of items
     * @return List of quantity of items
     */
    public List<Integer> getCustomerItemsQuantity(){
    	return this.customerItemsQuantity;
    }
    /**
     * This method returns the SaleDTO (saleinformation) for the sale
     * @return SaleDTO
     */
    public SaleDTO getSaleInformation() {
        return this.saleInformation;
    }
    
    public void addItem(Item item, int quantity) {
    	this.saleInformation.updateTotalVAT(item.getItemDTO().getVAT(), quantity);
    	this.saleInformation.updateTotalPrice(item.getItemDTO().getPrice(), quantity, (item.getItemDTO().getVAT()));
    	System.out.println("Running total: " + this.saleInformation.getTotalPrice());
    	System.out.println(item.getItemDTO().getItemDescription() + ", Price: " + item.getItemDTO().getPrice());
        isDuplicateItem(item, quantity);
    }
    
    public void isDuplicateItem(Item item, int quantity) {
        boolean found = false;
    	for(Item currentItem : items) {
    		if(currentItem.getItemIdentifier() == item.getItemIdentifier()) {   
    			found = true;
    			customerItemsQuantity.set(items.indexOf(currentItem), (customerItemsQuantity.get(items.indexOf(currentItem)) + quantity));
    		}
    	}
        if(found == false) {
    		items.add(item);
    		saleInformation.updateItems(item);
                customerItemsQuantity.add(quantity);
    	}
    }
    
    public Receipt getReceipt(Sale sale) {
    	return receipt;
    }
}
