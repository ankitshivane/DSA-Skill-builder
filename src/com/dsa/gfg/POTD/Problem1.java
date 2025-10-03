package com.dsa.gfg.POTD;

import java.util.Deque;
import java.util.LinkedList;

public class Problem1 {
    /**
     * Ques: https://www.geeksforgeeks.org/problems/maximum-subarray-sum--110820/1
     */
       // Returns the maximum subarray sum with length in [a, b]
        public static int maxSumSubarray(int[] arr, int a, int b) {
            int n = arr.length;
            int[] prefixSum = new int[n+1];
            // prefixSum[i] is sum of arr[0...i-1]
            for (int i = 0; i < n; i++)
                prefixSum[i+1] = prefixSum[i] + arr[i];

            int maxSum = Integer.MIN_VALUE;
            // For each end of window
            for (int end = a; end <= n; end++) {
                // For every possible window length [a,b]
                for (int len = a; len <= b && end-len >= 0; len++) {
                    int sum = prefixSum[end] - prefixSum[end-len];
                    maxSum = Math.max(maxSum, sum);
                }
            }
            return maxSum;
        }

        public static void main(String[] args) {
            int[] arr1 = {4, 5, -1, -2, 6};
            System.out.println("Approach 1:"+maxSumSubarray(arr1, 2, 4)); // Output: 9

            int[] arr2 = {-1, 3, -1, -2, 5, 3, -5, 2, 2};
            System.out.println("Approach 1:"+maxSumSubarray(arr2, 3, 5)); // Output: 8

            System.out.println("Approach 2:"+maxSumSubarray2(arr1, 2, 4)); // Output: 9
            System.out.println("Approach 2:"+maxSumSubarray2(arr2, 2, 4)); // Output: 9
        }
        // approach 2 - Optimize
        public static int maxSumSubarray2(int[] arr, int a, int b) {
            int n = arr.length;
            int[] prefix = new int[n + 1];
            for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + arr[i];

            Deque<Integer> dq = new LinkedList<>();
            int maxSum = Integer.MIN_VALUE;
            for (int j = a; j <= n; j++) {
                // Add valid window's left boundary
                if (j - a >= 0) {
                    while (!dq.isEmpty() && prefix[dq.peekLast()] >= prefix[j - a]) dq.pollLast();
                    dq.offerLast(j - a);
                }
                // Remove out-of-range left boundaries
                while (!dq.isEmpty() && dq.peekFirst() < j - b) dq.pollFirst();
                // Calculate maxSum for the current window ending at j (i.e., arr[i..j-1])
                if (!dq.isEmpty()) {
                    maxSum = Math.max(maxSum, prefix[j] - prefix[dq.peekFirst()]);
                }
            }
            return maxSum;
        }
}
