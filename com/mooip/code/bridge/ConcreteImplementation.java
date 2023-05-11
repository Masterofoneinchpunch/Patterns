package com.mooip.code.bridge;

/**
 * A specific implementation to be separate from the abstraction in the 
 * bridge pattern.
 * 
 * @author masterofoneinchpunch
 */
public final class ConcreteImplementation implements Implementation {
    /**
     * The operation to be called.
     */
    @Override
    public void operationImpl() {
        System.out.println("Calls operation from ConcreteImplementation");
    }
}
