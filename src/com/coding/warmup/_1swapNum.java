package com.coding.warmup;

public class _1swapNum {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 10;

        System.out.println("Before Swapping: " + n1 + "--" + n2);
// approach 1
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After Swapping Approach 1: " + n1 + "--" + n2);

        // approach 2

        int k1 = 20;
        int k2 = 10;
        k1 = k1 ^ k2;
        k2 = k1 ^ k2;
        k1 = k1 ^ k2;
        System.out.println("After Swapping Approach 1: " + k1 + "--" + k2);
    }
}
