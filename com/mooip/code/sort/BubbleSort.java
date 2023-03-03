package com.mooip.code.sort;

import java.util.Arrays;

/**
 * The infamous bubble sort.  A couple of different implementations.
 * 
 * @author masterofoneinchpunch
 * @see <a href="https://en.wikipedia.org/wiki/Bubble_sort">Bubble Sort Wiki</a>
 */
public final class BubbleSort implements Sort { 
    
    /**
     * Sort 1 for the bubble sort.
     * 
     * @param integers An array of Integers.
     * @return iterationCount The iteration count.
     */
    @Override
    public int sort(Integer[] integers) {    
        int length = integers.length;
        int iterationCount = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                iterationCount++;
                if (integers[j - 1] > integers[j]) {
                    int temp = integers[j - 1];
                    integers[j - 1] = integers[j];
                    integers[j] = temp;
                }
            }
        }
        
        return iterationCount;
    }
    
    /**
     * Sort 2 for the bubble sort.
     * 
     * @param integers An array of Integers.
     * @return iterationCount The iteration count.
     */
    public int sort2(Integer[] integers) {    
        int length = integers.length;
        int iterationCount = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int j = 1; j < length; j++) {
                iterationCount++;
                if (integers[j - 1] > integers[j]) {
                    int temp = integers[j - 1];
                    integers[j - 1] = integers[j];
                    integers[j] = temp;
                    swapped = true;
                }
            }
            length--;
        }
        
        return iterationCount;
    }
    
    private static void testSort() {
        Integer[] nums = {14,2,44,59,1,79,3};
        Integer[] nums1Test = {14,2,44,59,1,79,3};
        Integer[] nums2 = {1,2,3,4,5,6,7};
        Integer[] nums2Test = {1,2,3,4,5,6,7};

        BubbleSort bs = new BubbleSort();
        System.out.println("before sort: " + Arrays.toString(nums));
        int count = bs.sort(nums);
        int countSecondTest = bs.sort(nums2Test);
        System.out.println("iteration count: " + count + " " + countSecondTest);
        System.out.println("postsort: " + Arrays.toString(nums));
        System.out.println("postsort with nums2Test: " + Arrays.toString(nums2Test));
        
        count = bs.sort2(nums2); //this is in order so it will be a On complexity.
        int countFirstTest = bs.sort2(nums1Test);
        System.out.println("iteration count sort2: " + count + " " + countFirstTest);
        System.out.println("postsort2: " + Arrays.toString(nums2));
        System.out.println("postsort2 with nums1Test: " + Arrays.toString(nums1Test));
    }
    
    public static void main(String[] args){
        testSort();
    }    
}
