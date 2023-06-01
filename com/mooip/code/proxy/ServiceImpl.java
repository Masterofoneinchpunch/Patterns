package com.mooip.code.proxy;

/**
 * This is the implementation part of the proxy pattern.  The proxy
 * calls this (possibly this takes long or some reason you want to hide it
 * behind a proxy -- like it is remote or for security reasons.
 * 
 * @author masterofoneinchpunch
 */
public final class ServiceImpl implements Service {
    /**
     * Constructor.
     */
    public ServiceImpl() {
    }
    
    /**
     * The operation to be called.
     */
    @Override
    public void operation() {
        //operation
    }
}