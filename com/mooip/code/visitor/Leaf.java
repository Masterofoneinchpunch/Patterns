package com.mooip.code.visitor;

public final class Leaf extends Component {
    /**
     * Constructor for the Leaf.
     * 
     * @param value The value.
     * @param depth The depth of the Leaf.
     */
    public Leaf(int value, int depth) {
        super(value, depth);
    }

    /**
     * Accept is part of the visitor pattern.
     * 
     * @param visitor The visitor to be accepted.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLeaf(this);
    }
}

