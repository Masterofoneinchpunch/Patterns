package com.mooip.code.visitor;

/**
 * Getting a sum of all the values.
 * 
 * @author masterofoneinchpuch
 */
public final class SumVisitor implements Visitor {
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
     * Visits the composite and sums all the values.
     * 
     * @param node The Composite.
     */
   @Override
    public void visitComposite(Composite node) {
        result += node.getValue();
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

