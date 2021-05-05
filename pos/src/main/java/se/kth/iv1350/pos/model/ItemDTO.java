package se.kth.iv1350.pos.model;

public class ItemDTO {
	//private int itemIdentifier;
    private String itemDescription;
    private double price;
    private double VAT;
    
    public ItemDTO(String itemDescription, double price, double VAT) {
        //this.itemIdentifier = itemIdentifier;
    	this.itemDescription = itemDescription;
        this.price = price;
        this.VAT = VAT;
    }
    
    public String getItemDescription() {
        return this.itemDescription;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public double getVAT() {
        return this.VAT;
    }
    
}