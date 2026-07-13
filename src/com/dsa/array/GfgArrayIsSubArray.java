package com.dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GfgArrayIsSubArray {
    /**
     * https://www.geeksforgeeks.org/dsa/find-whether-an-array-is-subset-of-another-array-set-1/
     *
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {1, 1};
//        System.out.println(isSubset1(a, b));
//        System.out.println(isSubset2(a, b)); // this is wrong, solution is incomplete need to do more
        System.out.println(isSubsetOptimal(a, b)); //true
        System.out.println(isSubsetOptimal2(a, b)); //true
    }

    private static boolean isSubsetOptimal2(int[] arr, int arr2[]) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!mp.containsKey(arr2[i]) || (mp.get(arr2[i]) <= 0)) {
                return false;
            }
            mp.put(arr2[i], mp.getOrDefault(arr2[i], 0) - 1);
        }
        return true;
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
