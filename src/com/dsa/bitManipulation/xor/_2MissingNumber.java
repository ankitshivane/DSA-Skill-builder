package com.dsa.bitManipulation.xor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2MissingNumber {
    /**
     * https://leetcode.com/problems/missing-number/
     */
    public static void main(String[] args) {

        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(findMissingNumber(arr, arr.length)); // Output: 8

        int[] arr2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(findMissingNumber(arr2, arr2.length)); // Output: 8

        System.out.println(findMissingNumber2(arr2, arr2.length)); // Output: 8
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

    // brute force these code fails one leetcode test case for input [1] expected output is 0 and its giving 2
    private static int findMissingNumber2(int[] arr, int length) {
        Arrays.sort(arr);
        for (int i = length - 1; i > 0; i--) {
            int diff = arr[i] - arr[i - 1];
            if (diff > 1) {
                return arr[i] - 1;
            }
        }
        return arr[length - 1] + 1;
    }

    // brute force this code passes all leetcode test case
    public int missingNumber(int[] nums) {
        Set<Integer> uni = new HashSet<Integer>();
        for (int n : nums) {
            uni.add(n);
        }
        for (int i = 0; i < uni.size(); i++) {
            if (!uni.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
