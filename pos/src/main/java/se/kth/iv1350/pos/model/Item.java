package se.kth.iv1350.pos.model;

public class Item {
    private ItemDTO itemDTO;
    private int storeQuantity;
    
    private int itemIdentifier; 
    
    public Item(int itemIdentifier, ItemDTO itemDTO, int quantity) {
        this.itemIdentifier = itemIdentifier;
        this.itemDTO = itemDTO;
        this.storeQuantity = quantity;
    }
    
    public int getItemIdentifier() {
    	return this.itemIdentifier;
    }
    
    public int getStoreQuantity() {
    	return this.storeQuantity;
    }

    public void updateQuantity(int bought_quantity){
    	this.storeQuantity -= bought_quantity;
    }
    
    public ItemDTO getItemDTO() {
    	return this.itemDTO; 
    }
}
