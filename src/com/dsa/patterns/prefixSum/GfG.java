package com.dsa.patterns.prefixSum;// Java program to find equilibrium index of an array
// using prefix sum and suffix sum variables

import java.util.*;

class GfG {
    /**
     * https://www.geeksforgeeks.org/dsa/equilibrium-index-of-an-array/
     * @param arr
     * @return
     */
    static int equilibriumPoint(int[] arr) {
        int prefSum = 0, total = 0;

        // Calculate the array sum
        for (int ele : arr) {
            total += ele;
        }
        System.out.println("total=" + total);

        // Iterate pivot over all the elements of the array
        for (int pivot = 0; pivot < arr.length; pivot++) {
            int suffSum = total - prefSum - arr[pivot];
            if (prefSum == suffSum) {
                return pivot;
            }
            prefSum += arr[pivot];
        }

        // There is no equilibrium point
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};

        System.out.println(equilibriumPoint(arr));
    }
}