package com.mooip.code.sort;

import java.util.Arrays;

/**
 *
 * @author smckenna
 */
public final class ShellSort implements Sort {
    @Override
    public int sort(Integer[] integers) {    
        int iterationCount = 0;
        
        for (int gap = integers.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < integers.length; ++i) {
                int newElement = integers[i];
                int j = i;
                while (j >= gap && (integers[j - gap] > newElement)) {
                    iterationCount++;
                    integers[j] = integers[j - gap];
                    j -= gap;
                }
                integers[j] = newElement;
            }
        }
        
        return iterationCount;
    }
        
    private static void testSort() {
        Integer[] nums = {14,2,44,59,1,79,-22};

        ShellSort ss = new ShellSort();
        System.out.println("presort: " + Arrays.toString(nums));

        int iterationCount = ss.sort(nums);    
        System.out.println("postsort: " + Arrays.toString(nums));
        System.out.println("iteration count: " + iterationCount);
    }
        
    public static void main(String[] args){
        testSort();
    }               
}
