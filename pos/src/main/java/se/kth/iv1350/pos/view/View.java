package se.kth.iv1350.pos.view;

import se.kth.iv1350.pos.controller.Controller;
public class View {
    private Controller contr;
    
    /**
     * Creates a new instance, that uses the specified controller for all calls to other layers.
     * 
     * @param contr The controller to use for all calls to other layers.
     */
    public View(Controller contr) {
        this.contr = contr;
    }
    
    public void runFakeExecution() {
    	//Starta en ny försäljning
    	contr.startSale();
    	//Gör en specifik loop
    	contr.enterItem(8, 102);
    	contr.enterItem(2, 1);
    	//Avsluta försäljningen
    	contr.endSale();
    	contr.pay(100,"Cash");
    	contr.print();
    }
}

