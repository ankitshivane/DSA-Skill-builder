package com.dsa.gfg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayIsSubArray {
    /**
     * https://www.geeksforgeeks.org/dsa/find-whether-an-array-is-subset-of-another-array-set-1/
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 2};
        int[] b = {1, 1};
//        int[] a = {1,1};
//        int[] b = {1,1};
//        System.out.println(isSubset1(a, b));
//        System.out.println(isSubset2(a, b)); // this is wrong, solution is incomplete need to do more
        System.out.println(isSubsetOptimal(a, b));
    }

    private static boolean isSubset1(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    a[j] = -1;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSubset2(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int pointer = 0;
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            if (pointer < a.length &&
                    a[pointer] == b[i]) {
                a[pointer] = -1;
                found = true;
            }
            pointer++;
        }
        return true;
    }

    private static boolean isSubsetOptimal(int[] a, int[] b) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : a) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for (int i : b) {
            if (!mp.containsKey(i) || mp.get(i) == 0)
                return false;
            mp.put(i, mp.get(i) - 1);
        }
        return true;
    }
}
