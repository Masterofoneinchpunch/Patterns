package com.mooip.code.sort;

import java.util.Arrays;

/**
 * A quick sort.  Usually faster than a bubble sort.  See wiki link for details.
 * 
 * @author masterofoneinchpunch
 * @see <a href="https://en.wikipedia.org/wiki/Quicksort">Quick Sort Wiki</a>
 */
public final class QuickSort implements Sort {     
    private static int count = 0;
    
    /**
     * Sort for the quick sort.
     * 
     * @param integers An array of Integers.
     * @return iterationCount The iteration count.
     */
    @Override
    public int sort(Integer[] integers) {
        count = 0;
        sort(integers, 0, integers.length - 1);
        return count;
    }    

    private void sort(Integer integers[], int low, int high) {
        if (low < high) {
            int partIndex = partition(integers, low, high);
 
            sort(integers, low, partIndex-1);
            sort(integers, partIndex+1, high);
        }
    }
    
    private int partition(Integer integers[], int low, int high) {
        int pivot = integers[high]; 
        int index = (low-1); // index of smaller element
        for (int i = low; i < high; i++) {
            // If current element is smaller than or
            // equal to pivot
            if (integers[i] <= pivot) {
                index++;
                // swap integers[index] and integers[i]
                int temp = integers[index];
                integers[index] = integers[i];
                integers[i] = temp;
                count++;
            }
        }
 
        // swap integers[index+1] and integers[high] (or pivot)
        int temp = integers[index+1];
        integers[index+1] = integers[high];
        integers[high] = temp;
        count++;
        
        return index+1;
    }

    private static void testSort() {
        Integer[] nums = {14,2,44,59,1,79,3};
        Integer[] nums2Test = {1,2,3,4,5,6,7,8,9,10};
        Integer[] reverseTest = {10,9,8,7,6,5,4,3,2,1};

        QuickSort qs = new QuickSort();
        System.out.println("presort: " + Arrays.toString(nums));
        System.out.println("presort2: " + Arrays.toString(nums2Test));
        int qScount = qs.sort(nums);
        int countSecondTest = qs.sort(nums2Test);
        System.out.println("postsort: " + Arrays.toString(nums));
        System.out.println("postsort2: " + Arrays.toString(nums2Test));
        System.out.println("iteration count: " + qScount + " " + countSecondTest);
        
        System.out.println("presort reverse: " + Arrays.toString(reverseTest));
        int countThirdTest = qs.sort(reverseTest);
        System.out.println("postsort reverse: " + Arrays.toString(reverseTest));
        System.out.println("iteration count: " + countThirdTest);
        
    }
    
    public static void main(String[] args){
        testSort();
    } 
}
