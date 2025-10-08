package com.dsa.patterns.prefixSum;

import java.util.Arrays;

public class SumOfElementFromIdx {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,6,7,2};
        int result1 = doPrefix(arr, 0, 2);
        System.out.println(result1);

        int result2 = doPrefix(arr, 1, 3);
        System.out.println(result2);
        int result3 = doPrefix(arr, 2, 6);
        System.out.println(result3);

        System.out.println(Arrays.toString(doPrefix(arr)));
        int[] sum = doPrefix(arr);
        int sums = getSum(sum,2,6);
        System.out.println(sums);

    }

    private static int getSum(int[] sum, int start, int end) {
        int res = 0;
        if (start == 0) {
            res=sum[end];
            return res;
        }
        res=sum[end]-sum[start-1];
        return res;
    }

    private static int doPrefix(int[] arr, int startIdx, int endIdx) {
        int sum = 0;

        if (endIdx >= arr.length) {
            return -1;
        }
        for (; startIdx <= endIdx; startIdx++) {
            sum += arr[startIdx];
        }
        return sum;
    }

    private static int[] doPrefix(int[] arr) {
        int n = arr.length;
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = arr[i] + sum[i - 1];
        }
        return sum;
    }
}
