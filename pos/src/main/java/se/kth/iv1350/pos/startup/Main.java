package se.kth.iv1350.pos.startup;

import se.kth.iv1350.pos.view.View;

/**
 * Starts the entire application, contains the main method used to start the application.
 */
public class Main {
    /**
     * The main method used to start the application.
     * @param args The application does not take any command line parameters.
     */
    public static void main(String[] args) {

        Printer printer = new Printer();
        ExternalAccountingSystemHandler eas = new ExternalAccountingSystemHandler();
        ExternalInventorySystemHandler els = new ExternalInventorySystemHandler();

        Controller contr = new Controller(printer, eas, els);
        View view = new View(contr);
        
        view.runFakeExecution();
    }
}
