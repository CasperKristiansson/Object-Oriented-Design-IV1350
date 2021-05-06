package se.kth.iv1350.pos.view;

import se.kth.iv1350.pos.controller.Controller;
/**
 * The View of the program which runs a runFakeExecution task.
 */
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
    
    /**
     * Performs a fake sale by calling all system operations in the controller.
     */
    public void runFakeExecution() {
    	contr.startSale();
    	
    	contr.enterItem(8, 102);
    	contr.enterItem(2, 1);
    	
    	contr.endSale();
    	contr.pay(100,"Cash");
    	contr.print();
    }
}

