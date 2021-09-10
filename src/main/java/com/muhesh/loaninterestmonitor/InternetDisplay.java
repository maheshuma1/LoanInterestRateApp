
package com.muhesh.loaninterestmonitor;

/**
 *
 * @author Muhesh
 */
public class InternetDisplay implements Observer, DisplayPrinter{
    private double interest;
    private String bank;
    private String accountType;    
    private LoanData loanData;
    
    public InternetDisplay(LoanData loanData){
        this.loanData = loanData;
        this.loanData.attachObserver(this);
    }
    public void update(String bank, String accountType, double interest){
        this.interest = interest;
        this.bank = bank;
        this.accountType = accountType;
        display();
    }
    public void display(){
        System.out.println("Internet Display Alert New interest Rate " +  interest + "% for " + accountType + " at " + bank);
        
    }
}
