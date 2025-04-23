package com.dsa.patterns.slidingWindow;

import java.util.Arrays;

public class MaxSumArray1 {
    public static void main(String[] args) {
        int[] arr = {2, 45, 2, 3, 1, 3, 4, 6, 7};
        System.out.println(findMaxSumArrayBruteForce2(arr, 3));
    }

    private static int findMaxSumArrayBruteForce(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int[] sub = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < i + k; j++) {
                if ((i + k) < arr.length)
                    sum += arr[j];
            }
            sub[i] = sum;
            sum = 0;
        }
        for (int n : sub) {
            if (n > max)
                max = n;
        }
        return max;
    }

    private static int findMaxSumArrayBruteForce2(int[] arr, int k) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

}
