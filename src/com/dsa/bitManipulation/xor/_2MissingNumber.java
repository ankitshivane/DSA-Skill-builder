package com.dsa.bitManipulation.xor;

public class _2MissingNumber {
    public static void main(String[] args) {

        int[] arr = {3, 1, 0};
        System.out.println(findMissingNumber(arr, arr.length)); // Output: 2

        int[] arr2 = {20,22,23};
        System.out.println(findMissingNumber(arr2, arr2.length)); // Output: 21
    }

    private static int findMissingNumber(int[] arr, int length) {
        int result = 0;
        // Step 1: XOR all numbers from 0 to n (using the loop index i)
        // AND XOR all elements in the array (arr[i])
        for (int i = 0; i < length; i++) {
            result ^= arr[i] ^ i;
        }
        // Step 2: Don't forget to XOR the final number 'n' (which is the length)
        // since the loop only goes up to length - 1
        return result ^ length;
    }
}
