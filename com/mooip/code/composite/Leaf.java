package com.mooip.code.composite;

/**
 * Basic leaf for Composite pattern.
 * 
 * @author masterofoneinchpunch
 */
public final class Leaf extends Component {
    /**
     * Constructor for leaf.
     * 
     * @param value The value for the leaf.
     * @param depth The depth for the leaf.
     */
    public Leaf(int value, int depth) {
        super(value, depth);
    }
}

