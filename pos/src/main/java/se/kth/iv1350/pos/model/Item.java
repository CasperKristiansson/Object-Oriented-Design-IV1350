package se.kth.iv1350.pos.model;

public class Item {
    private ItemDTO itemDTO;
    private int quantity;
    private int itemIdentifier; 
    
    public Item(int itemIdentifier, ItemDTO itemDTO, int quantity) {
        this.itemIdentifier = itemIdentifier;
        this.itemDTO = itemDTO;
        this.quantity = quantity;
    }
    
    public int getItemIdentifier() {
    	return this.itemIdentifier;
    }
    
    public int getQuantity() {
    	return this.quantity;
    }

    public void updateQuantity(int bought_quantity){
    	this.quantity -= bought_quantity;
    }
    
    public ItemDTO getItemDTO() {
    	return this.itemDTO; 
    }
}
