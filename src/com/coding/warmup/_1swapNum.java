package com.coding.warmup;

public class _1swapNum {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        System.out.println("Before Swapping: " + n1 + "--" + n2);
// approach 1
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After Swapping Approach 1: " + n1 + "--" + n2);

        // approach 2


        int k1 = 10; //1010
        int k2 = 20; //10100
        k1 = k1 ^ k2; // 11110 which is 30, so k1 becomes 30
        k2 = k1 ^ k2; // 11110 ^ 10100 = 1010 which is 10, so k2 becomes 10
        k1 = k1 ^ k2; // 11110 ^ 1010 = 10100 which is 20, so k1 becomes 20
        System.out.println("After Swapping Approach 1: " + k1 + "--" + k2);
        /*
        OUTPUT:
        Before Swapping: 10--20
        After Swapping Approach 1: 20--10
        After Swapping Approach 1: 20--10

         */
    }
}
