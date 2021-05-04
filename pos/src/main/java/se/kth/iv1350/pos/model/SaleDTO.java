package se.kth.iv1350.pos.model;

public class SaleDTO {
    private java.time.LocalTime time;
    private String nameOfStore;
    private double totalDiscount;
    private double totalVAT;
    private double totalPrice;
    private Item[] nameOfItems;
    private double priceOfItems;
    
    public SaleInformation(java.time.LocalTime time,
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
        
    }
    
    public String getNameOfStore() {
        
    }
    
    public double getTotalDiscount() {
        
    }
    
    public double getTotalVAT() {
        
    }
    
    public double getTotalPrice() {
        
    }
    
    public Item[] getNameOfItems() {
        
    }
    
    public double getPriceItems() {
        
    }
}
