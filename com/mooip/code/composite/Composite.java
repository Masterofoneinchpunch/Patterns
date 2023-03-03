package com.mooip.code.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class for the Composite pattern.
 * 
 * @author masterofoneinchpunch
 */
public final class Composite extends Component {
    private final List<Component> children = new ArrayList();

    /**
     * The constructor for the Composite.
     * 
     * @param value The value for the Composite.
     * @param depth The depth for the Composite.
     */
    public Composite(int value, int depth) {
        super(value, depth);
    }

    /**
     * Adds a child to the Composite.
     * 
     * @param child A Component.
     */
    public void addChild(Component child) {
        children.add(child);
    }
    
    /**
     * Gets a child of this Composite.
     * 
     * @param index The index of the Composite.
     * @return Component
     */
    public Component getChild(int index) {
        return children.get(index);
    }
}

