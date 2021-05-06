package se.kth.iv1350.pos.model;
import java.util.*;

public class SaleDTO {
    private java.time.LocalTime time;
    private String nameOfStore;
    private double totalDiscount;
    private double totalVAT;
    private double totalPrice;
    private List<Item> nameOfItems;
    
    public SaleDTO(java.time.LocalTime time,
            String nameOfStore,
            double totalDiscount,
            double totalVAT,
            double totalPrice,
            List <Item> nameOfItems) {
        this.nameOfStore = nameOfStore;
        this.totalDiscount = totalDiscount;
        this.totalVAT = totalVAT;
        this.totalPrice = totalPrice;
        this.nameOfItems = new ArrayList<>();
    }
    
    public java.time.LocalTime getTime() {
        return this.time;
    }
    
    public String getNameOfStore() {
        return this.nameOfStore;
    }
    
    public double getTotalDiscount() {
        return this.totalDiscount;
    }
    
    public double getTotalVAT() {
        return this.totalVAT;
    }
    
    public double getTotalPrice() {
        return this.totalPrice;
    }
    
    public List<Item> getNameOfItems() {
        return this.nameOfItems;
    }
    
    public void updateTotalPrice(double amount, int quantity, double totalVAT) {
    	this.totalPrice += (amount * quantity) + totalVAT;
    }
    
    public void updateTotalVAT(double amount, int quantity) {
    	this.totalVAT += (amount * quantity);
    }
    
    public void updateNameOfItems(Item item) {
        nameOfItems.add(item);
    }
}
