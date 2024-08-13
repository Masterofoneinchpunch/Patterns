/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mooip.code.sort;

import java.util.Arrays;

/**
 *
 * @author smckenna
 */
public class MergeSort implements Sort {
    private int iterationCount = 0;

    @Override
    public int sort(Integer[] integers) {    

        mergeSort(integers, 0, integers.length);
        
        return iterationCount;
    }

    private void mergeSort(Integer[] integers, int start, int end) {
        iterationCount++;
        if (end - start < 2) {
            return;
        }
        
        int mid = (start + end) / 2;
        mergeSort(integers, start, mid);
        mergeSort(integers, mid, end);
        merge(integers, start, mid, end);
    }
    
    private void merge(Integer[] integers, int start, int mid, int end) {
        if (integers[mid - 1] >= integers[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        
        Integer[] temp = new Integer[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = (integers[i] >= integers[j]) ? integers[i++] : integers[j++];
        }
        System.arraycopy(integers, i, integers, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, integers, start, tempIndex);
    }
    
    private static void testSort() {
        Integer[] nums = {14,2,44,59,1,79,-22};

        MergeSort ms = new MergeSort();
        System.out.println("presort: " + Arrays.toString(nums));

        int iterationCount = ms.sort(nums);    
        System.out.println("postsort: " + Arrays.toString(nums));
        System.out.println("iteration count: " + iterationCount);
    }
        
    public static void main(String[] args){
        testSort();
    }               
}
