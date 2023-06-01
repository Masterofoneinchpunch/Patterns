package com.mooip.code.proxy;

/**
 * This is the interface (contract) part of the proxy pattern.  Both the proxy
 * and what the proxy calls usually extend this interface.
 * 
 * @author masterofoneinchpunch
 */
public interface Service {
    /**
     * The operation to be called.
     */
    public void operation();
}
