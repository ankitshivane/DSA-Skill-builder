package com.dsa.bitManipulation.xor;

public class _5LCBitCount {
    /**
     * https://leetcode.com/problems/number-of-1-bits/description/
     */
    public static void main(String[] args) {
        int n = 2147483645;
        System.out.println(hammingWeight(n)); //30

        int n2 = 128;
        System.out.println(hammingWeight(n2)); //1

        int n3 = 11;
        System.out.println(hammingWeight(n3));//3
    }

    private static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
