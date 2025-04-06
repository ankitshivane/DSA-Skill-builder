package com.dsa.array.leetcode;

/*
Find richest customer wealth
https://leetcode.com/problems/richest-customer-wealth/description/
 */
public class FindWealthOfMan {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(new FindWealthOfMan().maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            int summation = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                summation += accounts[i][j];
            }
            sum[i] = summation;
        }

        return findMaxOfNum(sum);
    }

    private static int findMaxOfNum(int[] sum) {
        int max = sum[0];
        for (int i : sum) {
            if (i > max)
                max = i;
        }
        return max;
    }

    // Approach:2
    private static int findMaxWealthApproach2(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int summation = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                summation += accounts[i][j];
            }
            if (summation > ans)
                ans = summation;
        }

        return ans;
    }
}
