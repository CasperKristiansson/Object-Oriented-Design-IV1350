package se.kth.iv1350.pos.model;

import java.util.*;
import se.kth.iv1350.pos.model.*;
import se.kth.iv1350.pos.view.View;
import se.kth.iv1350.pos.controller.Controller;
import se.kth.iv1350.pos.integration.*;

public class Receipt {
    private SaleDTO saleInformation;
    private java.time.LocalTime time;
    private String nameOfStore;
    private double totalDiscount;
    private double totalVAT;
    private double totalPrice;
    private List<Item> nameOfItems;
    
    public Receipt(SaleDTO saleInformation) {
        this.saleInformation = saleInformation;
        this.nameOfStore = saleInformation.getNameOfStore();
        this.totalDiscount = saleInformation.getTotalDiscount();
        this.totalVAT = saleInformation.getTotalVAT();
        this.totalPrice = saleInformation.getTotalPrice();
        this.nameOfItems = saleInformation.getItems();
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
}
