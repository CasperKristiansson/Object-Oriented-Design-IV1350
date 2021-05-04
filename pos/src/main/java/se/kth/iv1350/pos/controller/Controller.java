package se.kth.iv1350.pos.controller;

public class Controller {
    private Sale sale;
    
    public Controller(Printer printer, ExternalAccountingSystem eas, ExternalInventorySystemHandler els) {
        this.printer = printer;
        this.eas = eas;
        this.els = els;
    }
    
    public void startSale() {
        sale = new Sale();
    }
}