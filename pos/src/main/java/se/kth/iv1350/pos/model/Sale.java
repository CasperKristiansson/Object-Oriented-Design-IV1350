package se.kth.iv1350.pos.model;

import se.kth.iv1350.pos.integration.*;
import se.kth.iv1350.pos.model.*;
import se.kth.iv1350.pos.controller.Controller;
import java.time.*;
import java.util.*;

public class Sale {
	private LocalTime time; 
    private SaleDTO saleInformation;
    private List<Item> items; 
    
    public Sale () {
    	this.time = LocalTime.now();
    	this.items = new ArrayList<>();
    	//this.saleInformation = new SaleDTO("Gittans Livs", 0, 0, 0, );
    }
    
    //Returnerar de föremål som läggs till av controller (kundens önskade föremål)
    public List<Item> getItems() {
    	return this.items;
    }
    
    public SaleDTO getSaleInformation() {
        return this.saleInformation;
    }
    
    public void addItem(Item item, int quantity) {
    	int itemIdentifier = item.getItemIdentifier();
    	ItemDTO itemDTO = item.getItemDTO();
//    	this.items[0] = new Item(itemIdentifier, itemDTO, quantity); //GÖR TILL ARRAYLIST ISTÄLLET
    }
    
    public Receipt getReceipt(Sale sale) {
    	Receipt receipt = new Receipt(sale); //Tillfällig
    	return receipt;
    }
    
    public void applyDiscount(double amount) {
        
    }
}
