package com.coding.warmup;

import java.util.ArrayList;

public class _5MinMaxGfg {
    /**
     * https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?page=1&category=Arrays,Strings&difficulty=Basic&sortBy=submissions
     */

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 8, 6};
        System.out.println(findMinMax(arr)); //[1, 8]
        System.out.println(findMinMaxOptimal(arr));
    }

    // Time Complexity: O(n), Space Complexity: O(1)
    private static ArrayList<Integer> findMinMax(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        al.add(min);
        al.add(max);
        return al;
    }

    private static ArrayList<Integer> findMinMaxOptimal(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();

        // Edge case: If array is empty, return empty list or handle as per problem spec
        if (arr == null || arr.length == 0) return al;

        // Trick: Initialize min and max with the very first element
        int min = arr[0];
        int max = arr[0];

        // Optimization: Start loop from index 1 since index 0 is already accounted for
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) { // Optimization: 'else if' avoids unnecessary checking
                max = arr[i];
            }
        }

        al.add(min);
        al.add(max);
        return al;
    }
}
