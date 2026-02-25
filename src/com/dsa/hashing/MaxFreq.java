package com.dsa.hashing;

import java.util.HashMap;

public class MaxFreq {
    /**
     * Find element with maximum frequency
     * input: array
     * output: single number
     */
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 33, 2, 1, 2, 2, 1};
        System.out.println(findMaxFreqElement1(arr));
    }

    private static int findMaxFreqElement1(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max = 0;
        int el = -1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            if (max < mp.get(arr[i])) {
                max = mp.get(arr[i]);
                el = arr[i];
            }
        }
        return el;
    }
}
