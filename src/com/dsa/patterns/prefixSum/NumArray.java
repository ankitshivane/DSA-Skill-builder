package com.dsa.patterns.prefixSum;

import java.util.Arrays;

class NumArray {
    private int[] prefixSum;

    public static void main(String[] args) {
        int[] a={-2, 0, 3, -5, 2, -1};
        NumArray l1=new NumArray(a);
        System.out.println(l1.sumRange(0,2));
        System.out.println(l1.sumRange(2,5));
        System.out.println(l1.sumRange(0,5));
    }
    // Constructor: build prefix sum array
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0; // base case

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        System.out.println(Arrays.toString(prefixSum));
    }

    // Return sum of range [left, right]
    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}
