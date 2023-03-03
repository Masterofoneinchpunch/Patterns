package com.mooip.code.composite;

/**
 * Component class for the Composite pattern.
 * 
 * @author masterofoneinchpunch
 */
public abstract class Component {
    private final int value;
    private final int depth;

    /**
     * Component constructor.
     * 
     * @param value The value for the Component.
     * @param depth The depth for the Component;
     */
    public Component(int value, int depth) {
        this.value = value;
        this.depth = depth;
    }

    /**
     * Gets the value.
     * 
     * @return value The value.
     */
    public int getValue() {
        return value;
    }

    /**
     * Gets the depth.
     * 
     * @return depth.
     */
    public int getDepth() {
        return depth;
    }
}
