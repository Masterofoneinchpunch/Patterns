package com.mooip.code.bridge;

/** 
 * Basic testing of Bridge pattern.
 * 
 * @author masterofoneinchpunch
 */
public final class TestBridge {
    public TestBridge() {        
    }
    
    /**
     * Main method for testing.
     * 
     * @param args String array of arguments.
     */
    public static void main(String[] args) {
        Abstraction abbieNormal = new Abstraction();
        abbieNormal.setImplementation(new DriverImplementation());
        abbieNormal.callImplementation();
        abbieNormal.setImplementation(new ConcreteImplementation());
        abbieNormal.callImplementation();
        
        abbieNormal = new RefinedAbstraction();
        abbieNormal.setImplementation(new DriverImplementation());
        abbieNormal.callImplementation();
        abbieNormal.setImplementation(new ConcreteImplementation());
        abbieNormal.callImplementation();
    }   
}
