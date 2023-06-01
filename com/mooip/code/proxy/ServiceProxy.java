package com.mooip.code.proxy;

/**
 * This is the proxy part of the proxy pattern.  This calls the implementation.
 * You can do something before it like check security or do some work before the call.
 * A proxy basically means it is a stand-in which is why both the proxy and the impl
 * will use the same interface.
 * 
 * @author masterofoneinchpunch
 */
public final class ServiceProxy implements Service {
    private final ServiceImpl impl = new ServiceImpl();

    /**
     * Constructor.
     */
    public ServiceProxy() {        
    }
    
    /**
     * The operation to be called.
     */
    @Override
    public void operation() {
        //obvious there is a reason you might want to call this like check security.
        impl.operation(); //forward operation
    }
}