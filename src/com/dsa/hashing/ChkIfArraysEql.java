package com.dsa.hashing;

import java.util.*;

public class ChkIfArraysEql {
    /**
     * https://www.geeksforgeeks.org/dsa/check-if-two-arrays-are-equal-or-not/
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0, 2};
        int[] b = {2, 4, 5, 0, 1, 0};
        System.out.println(checkEqual(a, b));
        System.out.println(checkEqual2(a, b));
    }

    /*
    as the number of elements are same so the idea is to sort both arrays in ascending and use two pointer approach
    to compare every element if we found any difference then arrays are not equal
     */
    public static boolean checkEqual(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        int pointer = 0;
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            if (pointer < b.length && a[i] != b[pointer])
                return false;
            pointer++;
        }
        return true;
    }

    /*
    Here using Hashing Data structure HashMap
    1. in here we are storing first array in map with its occurring count
    2. then for every element in second array check in the map and evaluate that
        a. if the element does not present in the map as key itself then the array are not equals
        b. or if the count of the key is zero means that element is extra in the second array so evaluate as false means both array are not equals
     */
    public static boolean checkEqual2(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int n : a) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }
        for (int n : b) {
            if (!counter.containsKey(n) || counter.get(n) == 0) {
                return false;
            }
            counter.put(n, counter.get(n) - 1);
        }
        return true;
    }

}
