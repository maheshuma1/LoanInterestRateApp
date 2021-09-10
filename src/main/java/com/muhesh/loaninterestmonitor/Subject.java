
package com.muhesh.loaninterestmonitor;

/**
 *
 * @author Muhesh
 */
public interface Subject {
    public void attachObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
