package com.dsa.patterns.prefixSum;

public class LC724 {
    public static void main(String[] args) {
        int[] nums = {2, 1, -1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int totalSum = prefix[n - 1];
        for (int i = 0; i < prefix.length; i++) {
            int leftSum = i == 0 ? 0 : prefix[i - 1];
            int rightSum = totalSum - prefix[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
