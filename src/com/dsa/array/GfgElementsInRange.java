package com.dsa.array;

import java.util.HashSet;

public class GfgElementsInRange {
    /**
     * https://www.geeksforgeeks.org/problems/elements-in-the-range2834/1
     */
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 7, 8, 3};
        int start = 2;
        int end = 6;
        System.out.println(checkElements(start, end, arr));
    }

    public static boolean checkElements(int start, int end, int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
