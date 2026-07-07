package com.dsa.bitManipulation.xor;

import java.util.HashMap;
import java.util.Map;

public class _1FindSingleNum {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(findSingleNum1(arr)); //4
        System.out.println(findSingleNumBruteForce1(arr));
        System.out.println(findSingleNumBruteForce2(arr));
    }

    // Optimal Time complexity O(n) and space compl is O(1)
    private static int findSingleNum1(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result = result ^ num;
        }
        return result;
    }

    private static int findSingleNumBruteForce1(int[] arr) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : arr) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mp : counter.entrySet()) {
            if (mp.getValue() == 1) {
                return mp.getKey();
            }
        }
        return -1;
    }

    /**
     * Below program has few issue like:
     * 1. If your input array contains a negative number, like arr = {-4, 1, 1}, your loop tries to do counter[-4]++.
     * Because array indices cannot be negative, your code will instantly throw an ArrayIndexOutOfBoundsException and crash.
     * 2. Memory Explosion due to new counter array initialization
     */
    private static int findSingleNumBruteForce2(int[] arr) {
        int[] counter = new int[Math.max(findMax(arr), arr.length)];
        for (int num : arr) {
            counter[num]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }


}
