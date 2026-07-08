package com.dsa.bitManipulation.xor;

import java.util.HashSet;
import java.util.Set;

public class GFG_missingNumber {
    /**
     * https://www.geeksforgeeks.org/problems/missing-number-in-shuffled-array0938/1
     */
    public static void main(String[] args) {
        int[] arr1 = {4, 8, 1, 3, 7};
        int[] arr2 = {7, 4, 3, 1};
        System.out.println(missingByBruteForce(arr1, arr2));  //8
        System.out.println(missingByOptimal1(arr1, arr2)); // 8
        System.out.println(missingByOptimal(arr1,arr2)); // best solution output 8
    }

    private static int missingByOptimal(int[] arr1, int[] arr2) {
        int result = 0;
        for (int n : arr1) {
            result ^= n;
        }
        for (int n : arr2) {
            result ^= n;
        }
        return result;
    }

    // but it has many bugs in it so ignore this solution
    private static int missingByOptimal1(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < resultArr.length; i++) {
            if (i < arr1.length) {
                resultArr[i] = arr1[i];
            }
            if (i >= 5) {
                resultArr[i] = arr2[k];
                k++;
            }
        }

        int result = 0;
        for (int num : resultArr) {
            result ^= num;
        }
        return result;
    }

    private static int missingByBruteForce(int[] arr1, int[] arr2) {
        Set<Integer> arr2Set = new HashSet<>();
        for (int num : arr2) {
            arr2Set.add(num);
        }
        for (int num : arr1) {
            if (!arr2Set.contains(num))
                return num;
        }
        return -1;
    }
}
