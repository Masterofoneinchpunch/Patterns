package com.mooip.code.visitor;

/**
 * A basic interface for the Visitor pattern example.
 * 
 * @author masterofoneinchpunch
 */
public interface Visitor {
    /**
     * Gets the Result.
     * 
     * @return result The result.
     */
    public int getResult();
    
    /**
     * Visits the composite.
     * 
     * @param node The Composite.
     */
    public void visitComposite(Composite node);
    
    /**
     * Visits the Leaf.
     * 
     * @param leaf The Leaf.
     */
    public void visitLeaf(Leaf leaf);
}

