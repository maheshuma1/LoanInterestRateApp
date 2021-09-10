
package com.muhesh.loaninterestmonitor;

/**
 *
 * @author Muhesh
 */
public interface Observer {
    public void update(String bank, String accountType, double interest);
}
