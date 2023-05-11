package com.mooip.code.bridge;

/**
 * Abstraction class for Bridge pattern.
 * 
 * @author masterofoneinchpunch
 */
public class Abstraction {
    private Implementation implementor;
    
    /**
     * Sets the implementation to be run.
     * 
     * @param implementor The Implementation.
     */
    public void setImplementation(Implementation implementor) {
        this.implementor = implementor;
    }
    
    /**
     * Calls the implementation.
     */
    public void callImplementation() {
        implementor.operationImpl();
    }
}
