package com.dsa.array;

import java.util.HashSet;

public class _3ConseThreeNumbers {
    /**
     * https://www.geeksforgeeks.org/problems/special-integers/1
     * The challenge is the count of unique numbers who have both their consecutive numbers present in the array. (i-1, i, i+1)
     */
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {2, 5, 3, 4, 3, 3, 2, 7, 9, 6};
        System.out.println(consecutiveNumbersSum2(n, arr));
    }


    private static int consecutiveNumbersSum2(int n, int[] arr) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int num : set) {
            int curr = num;
            int prev = curr - 1;
            int next = curr + 1;
            if (set.contains(prev) && set.contains(next)) {
                count++;
            }
        }
        return count;
    }
}
