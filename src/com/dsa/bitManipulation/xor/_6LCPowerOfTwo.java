package com.dsa.bitManipulation.xor;

public class _6LCPowerOfTwo {
    /**
     * https://leetcode.com/problems/power-of-two/description/
     */
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPowerOfTwo(n)); // false

        int n2 = 16;
        System.out.println(isPowerOfTwo(n2)); // true


        int n3 = 0;
        System.out.println(isPowerOfTwo(n3)); // false

    }

    private static boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }
}
