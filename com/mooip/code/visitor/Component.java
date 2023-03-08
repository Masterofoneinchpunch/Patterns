package com.mooip.code.visitor;

/**
 * Component part (which is part of a Composite) of the visitor pattern.
 * 
 * @author masterofoneinchpunch
 */
public abstract class Component {
    private final int value;
    private final int depth;

    /**
     * Component constructor. 
     * 
     * @param value The value.
     * @param depth How deep you are.
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
     * @return depth The depth.
     */
    public int getDepth() {
        return depth;
    }

    /**
     * The accept method of the visitor.
     * 
     * @param visitor The visitor.
     */
    public abstract void accept(Visitor visitor);
}
