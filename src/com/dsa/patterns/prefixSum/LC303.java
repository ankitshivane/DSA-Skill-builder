package com.dsa.patterns.prefixSum;

import java.util.Arrays;

public class LC303 {
    private static int[] prefixSum;

    public static void main(String[] args) {
//        int[][] arr = {{-2, 0, 3, -5, 2, -1}, {0, 2}, {2, 5}, {0, 5}};
//        int[] num = arr[0];
//        System.out.println(Arrays.toString(num));
//        int[] sum = new int[num.length];
//        sum[0] = arr[0][0];
//        for (int i = 1; i < sum.length; i++) {
//            sum[i] = sum[i - 1] + num[i];
//        }
//        System.out.println(Arrays.toString(sum));
//        int left = arr[3][0];
//        int right = arr[3][1];
//        int query = 0;
//        if (left == 0) {
//            query = sum[right];
//        } else {
//            query = sum[right] - sum[left - 1];
//        }
//        System.out.println(query);


        int[] a={-2, 0, 3, -5, 2, -1};
        LC303 l1=new LC303(a);
        System.out.println(l1.sumRange(0,2));
        System.out.println(l1.sumRange(2,5));
        System.out.println(l1.sumRange(0,5));

    }

    public LC303(int[] nums) {
        prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
        System.out.println(Arrays.toString(prefixSum)); //[0, -2, -2, 1, -4, -2, -3]
    }

    public int sumRange(int left, int right) {
        return prefixSum[right+1] - prefixSum[left];
    }
}