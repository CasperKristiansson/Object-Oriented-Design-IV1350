package se.kth.iv1350.pos.model;

public class SaleDTO {
    private java.time.LocalTime time;
    private String nameOfStore;
    private double totalDiscount;
    private double totalVAT;
    private double totalPrice;
    private Item[] nameOfItems;
    private double priceOfItems;
    
    public SaleDTO(java.time.LocalTime time,
            String nameOfStore,
            double totalDiscount,
            double totalVAT,
            double totalPrice,
            Item[] nameOfItems,
            double priceOfItems) {
        this.nameOfStore = nameOfStore;
        this.totalDiscount = totalDiscount;
        this.totalVAT = totalVAT;
        this.totalPrice = totalPrice;
        this.nameOfItems = nameOfItems;
        this.priceOfItems = priceOfItems;
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
    
    public Item[] getNameOfItems() {
        return this.nameOfItems;
    }
    
    public double getPriceOfItems() {
        return this.priceOfItems;
    }
}
