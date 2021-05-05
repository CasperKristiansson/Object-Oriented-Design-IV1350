package se.kth.iv1350.pos.integration;

import se.kth.iv1350.pos.model.*;
import java.util.*;

public class ExternalInventorySystemHandler {
    //private Item[] storeItems;
    private List<Item> storeItems = new ArrayList<>();
    private List<ItemDTO> itemDTOs = new ArrayList<>();
    
    
    public ExternalInventorySystemHandler() {}  
    
    public void addItem() {
    	this.itemDTOs.add(new ItemDTO("Kyckling; Näringsämnen: VITAMIN", 69, 20));
    	this.itemDTOs.add(new ItemDTO("Bacon; EXTRA FET", 420, 69));
    	this.itemDTOs.add(new ItemDTO("Mjöl; Perfekt för bullar", 29, 5));
    	this.itemDTOs.add(new ItemDTO("Banan; Extra saftig", 5, 1));
    	
    	this.storeItems.add(new Item(1,itemDTOs.get(0),100));
    	this.storeItems.add(new Item(2,itemDTOs.get(1),100));
    	this.storeItems.add(new Item(3,itemDTOs.get(2),100));
    	this.storeItems.add(new Item(4,itemDTOs.get(3),100));
    }
    
    public Item search(int itemIdentifier) {
    	for(Item item : storeItems) {
    		if(item.getItemIdentifier() == itemIdentifier) {
    			return item;
    		}
    	}
    	return null; //Varan finns inte
    }
    
    public void update(Sale sale) {
        List<Item> items = sale.getItems();
        
        //Loop som går igenom och matchar kundens önskade föremål med butikens utbud
        for(Item item : items) {
        	System.out.println("hej");
        	for(Item item2 :storeItems) {
        		if(item == item2) {
        			storeItems.get(storeItems.indexOf(item2)).updateQuantity(items.get(storeItems.indexOf(item2)).getQuantity());;
        		}
        	}
        }
        
    }
    
    public int test() {
    	return this.storeItems.get(0).getQuantity();
    }
}
