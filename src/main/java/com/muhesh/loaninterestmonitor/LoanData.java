
package com.muhesh.loaninterestmonitor;

/**
 *
 * @author Muhesh
 */
import java.util.*;
public class LoanData implements Subject{
    private List<Observer> observers;
    
    private double interest;
    private String bank;
    private String accountType;
    
    public LoanData(){
        observers = new ArrayList<Observer>();
    }
    public void attachObserver(Observer o){
        observers.add(o);
    }
    
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(bank, accountType, interest);
        }
    }
    public void interestChanged(){
        notifyObservers();
    }
    public void setOptions(String bank, String accountType ,double interest){
        this.interest = interest;
        this.bank = bank;
        this.accountType = accountType;
        notifyObservers();
    }
    public double getInterest(){
        return interest;
    }
}
