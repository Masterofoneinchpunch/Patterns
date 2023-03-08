package com.mooip.code.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * The Composite (part of its own pattern) of the visitor.
 * 
 * @author masterofoneinchpunch
 */
public final class Composite extends Component {
    private final List<Component> children = new ArrayList();

    /**
     * Constructor for the Composite.
     * 
     * @param value The value.
     * @param depth The depth.
     */
    public Composite(int value, int depth) {
        super(value, depth);
    }

    /**
     * Accept is part of the visitor pattern.
     * 
     * @param visitor The visitor to be accepted.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitComposite(this);

        for (Component child : children) {
            child.accept(visitor);
        }
    }

    /**
     * Adding a child to the Composite.
     * 
     * @param child The child.
     */
    public void addChild(Component child) {
        children.add(child);
    }
}

