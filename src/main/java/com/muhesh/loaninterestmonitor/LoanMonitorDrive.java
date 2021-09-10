
package com.muhesh.loaninterestmonitor;

/**
 *
 * @author Muhesh
 */
public class LoanMonitorDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LoanData loanData = new LoanData();
        
        CableDisplay cableDisplay = new CableDisplay(loanData);
        InternetDisplay internetDisplay = new InternetDisplay(loanData);
        NewsPaperDisplay newsPaperDisplay = new NewsPaperDisplay(loanData);
        
        loanData.setOptions("Barclays Bank","Personal Account", 10.0);
        System.out.println("\n");
        
        loanData.setOptions("Morgan Chase Bank", "Business Account", 2.0);
        System.out.println("\n");
        
        loanData.removeObserver(cableDisplay);
        
        loanData.setOptions("Morgan Chase Bank","Business Account",15.0);
        
        
    }
}
