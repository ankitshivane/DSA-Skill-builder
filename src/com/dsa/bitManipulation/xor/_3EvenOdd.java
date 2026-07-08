package com.dsa.bitManipulation.xor;


public class _3EvenOdd {
    /**
     * https://www.geeksforgeeks.org/problems/odd-or-even3618/1
     */
    public static void main(String[] args) {
        int n1 = 23;
        System.out.println(isEven(n1)); // false

        int n2 = 22;
        System.out.println(isEven(n2)); //true
    }

    private static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
