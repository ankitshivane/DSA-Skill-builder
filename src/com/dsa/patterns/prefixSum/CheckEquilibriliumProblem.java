package com.dsa.patterns.prefixSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckEquilibriliumProblem {
    /**
     * https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int n = arr.length;
        System.out.println(checkIfEquilibrium(arr, n));
        System.out.println(findEquilibrium(arr));
    }

    private static int findEquilibrium(int[] arr) {
        int n=arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 1; i < n; i++) {
            if (prefix[i - 1] == (prefix[n - 1] - prefix[i])) {
                return i;
            }
        }
        return -1;
    }

    private static boolean checkIfEquilibrium(int[] arr, int n) {
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println("Prefix[]=" + Arrays.toString(prefix));
        for (int i = 1; i < n; i++) {
            if (prefix[i - 1] == (prefix[n - 1] - prefix[i])) {
                return true;
            }
        }
        return false;
    }

}
