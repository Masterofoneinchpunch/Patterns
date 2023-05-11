package com.mooip.code.bridge;

/**
 * A refined abstraction for the bridge pattern.
 * 
 * @author masterofoneinchpunch
 */
public final class RefinedAbstraction extends Abstraction {
    /**
     * Calls the implementation.
     */
    @Override
    public void callImplementation() {
        super.callImplementation();
        System.out.println("additional behavior");
    }  
}
