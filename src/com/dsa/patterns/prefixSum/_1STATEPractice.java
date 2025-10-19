package com.dsa.patterns.prefixSum;

import java.util.Arrays;

public class _1STATEPractice {
    /**
     * Problem variations:
     * <p>
     * Compute prefix sum array of given array.
     * <p>
     * Given array and multiple queries (l, r) → print sum of subarray.
     * <p>
     * Given array → print cumulative sum at each index.
     * <p>
     * Find average of elements in range (l, r) (use prefix sum).
     * <p>
     * Given prefix sum array → reconstruct the original array.
     * <p>
     * Compare sums of two subarrays quickly using prefix array.
     * <p>
     * Validate your prefix sum implementation by comparing brute-force and optimized answers.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 4, 3, 9};
        solution1(arr);

    }

    private static void solution1(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        System.out.println(Arrays.toString(prefix));
        // Q.2 Multiple subqueries (l,r) for example (1,3), (2,4)
        System.out.println("(1,3):"+(prefix[3]-prefix[1]));
        // Q.4 Find average of elements in range (l, r) (use prefix sum).

    }
}
