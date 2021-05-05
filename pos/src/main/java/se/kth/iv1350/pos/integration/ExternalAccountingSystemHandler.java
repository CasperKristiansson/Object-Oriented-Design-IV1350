package se.kth.iv1350.pos.integration;

import se.kth.iv1350.pos.model.*;
import se.kth.iv1350.pos.view.View;
import se.kth.iv1350.pos.controller.Controller;
import se.kth.iv1350.pos.integration.*;

public class ExternalAccountingSystemHandler {
    private int storeBalance;
    
    public ExternalAccountingSystemHandler() {
        this.storeBalance = 100; //TEST
    }
    
    public void update(Sale sale) {
        
    }
}
