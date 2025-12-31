package com.dsa.hashing;

import java.util.HashSet;

public class CheckIfArrayConDup {
    /**
     * Check If an array contains duplicate
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(approach1(arr));
    }

    private static boolean approach1(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i]))
                return true;
            set.add(arr[i]);
        }
        return false;
    }
}
