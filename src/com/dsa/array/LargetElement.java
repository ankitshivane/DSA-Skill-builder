package com.dsa.array;

import java.util.Arrays;

/*
Que: find the largest/Maximum element in the array
 */
public class LargetElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 2};
        System.out.println("Approach 1:" + findLargest(arr));
        System.out.println("Approach 2:" + findLargestApproach2(arr));
    }

    // Approach:1
    /*
    Here time complexity of this solution is O(n), so this is an much optimal solution then approach:2
     */
    private static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Approach:2
    /*
    This is brute force solution because its Time complexity for sorting is O(nlogn)

     */
    private static int findLargestApproach2(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
