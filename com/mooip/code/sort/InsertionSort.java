package com.mooip.code.sort;

import java.util.Arrays;

/**
 *
 * @author smckenna
 */
public final class InsertionSort implements Sort {
    @Override
    public int sort(Integer[] integers) {    
        int iterationCount = 0;
        
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < integers.length; firstUnsortedIndex++) {
            int newElement = integers[firstUnsortedIndex];
            int i;
            
            for (i = firstUnsortedIndex; i > 0 && integers[i-1] > newElement; --i) {
                iterationCount++;
                integers[i] = integers[i-1];
            }
            integers[i] = newElement;
        }
        
        return iterationCount;
    }
        
    private static void testSort() {
        Integer[] nums = {14,2,44,59,1,79,-22};

        InsertionSort is = new InsertionSort();
        System.out.println("presort: " + Arrays.toString(nums));

        int iterationCount = is.sort(nums);    
        System.out.println("postsort: " + Arrays.toString(nums));
        System.out.println("iteration count: " + iterationCount);
    }
        
    public static void main(String[] args){
        testSort();
    }           
}
