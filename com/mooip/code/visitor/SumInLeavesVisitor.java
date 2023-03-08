package com.mooip.code.visitor;

/**
 * Getting a sum of all the leafs.
 * 
 * @author masterofoneinchpuch
 */
public final class SumInLeavesVisitor implements Visitor {
    private int result = 0;
    
    /**
     * Gets the Result.
     * 
     * @return result The result.
     */
    @Override
    public int getResult() {
        return result;
    }

    /**
     * Visits the composite and does nothing here..
     * 
     * @param node The Composite.
     */
    @Override
    public void visitComposite(Composite node) {
    }

    /**
     * Visits the Leaf and gets a sum of the leaf.
     * 
     * @param leaf The Leaf.
     */
    @Override
    public void visitLeaf(Leaf leaf) {
        result += leaf.getValue();
    }
}

