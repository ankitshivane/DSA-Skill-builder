package com.dsa.patterns.prefixSum;

import java.util.Arrays;

public class PracticeProg2 {
    /**
     * calculate weghted sum
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 6, 1};
        int[] res = new int[arr.length];

        int start = 2;
        int end = 3;

        int ans = 0;

        int c = 1;
        for (int i = start; i <= end; i++, c++) {
            ans += arr[i] * c;
        }
        System.out.println("Queries result start:" + start + ", end:" + end + ", result as " + ans);
    }
}
