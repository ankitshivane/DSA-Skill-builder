package com.dsa.hashing;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    /*
    https://www.geeksforgeeks.org/problems/find-distinct-elements--130928/1
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1};
//        int[] arr = new int[]{-9 ,-9, -9, -5, 6, -9 ,6 ,-9, -9 ,-9}; // this program wont work for the negative index
        countDistinctElementApproach1(arr);
        countDistinctElementApproach2(arr);
    }

    private static void countDistinctElementApproach2(int[] arr) {
        int cnt = 0;
        // find the max element
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] hash = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static void countDistinctElementApproach1(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
