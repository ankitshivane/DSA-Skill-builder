package com.dsa.patterns.prefixSum;

import java.util.Arrays;

public class LC1413 {
    public static void main(String[] args) {
        int[] nums = {-12};
        LC1413 o = new LC1413();
        System.out.println(o.minStartValue(nums));
    }

    public int minStartValue(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        int startValue = 1;

        for (int i = 0; i < n; i++) {
            if (sum[i] + startValue < 1) {
                startValue++;
                i = 0;
            }
        }

        return startValue;
    }
}
