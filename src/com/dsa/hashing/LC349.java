package com.dsa.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LC349 {
    /**
     *
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        System.out.println(Arrays.toString(intersection2(nums1, nums2)));
        System.out.println(Arrays.toString(intersection3(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1Set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for (int n1 : nums1) {
            num1Set.add(n1);
        }

        for (int n2 : nums2) {
            if (num1Set.contains(n2)) {
                resultSet.add(n2);
            }
        }

        int[] unionArr = new int[resultSet.size()];
        int pointer = 0;
        for (int num : resultSet) {
            unionArr[pointer] = num;
            pointer++;
        }
        return unionArr;
    }

    //using two pointer
    private static int[] intersection2(int[] nums1, int[] nums2) {
        // both arrays needs to be sorted first in order to compare with two pointer approach
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int p1 = 0;
        int p2 = 0;
        HashSet<Integer> set = new HashSet<>();
        while (p1 < n1 && p2 < n2) {
            if (nums1[p1] == nums2[p2]) {
                set.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        int[] result = new int[set.size()];
        int pointer = 0;
        for (int num : set) {
            result[pointer++] = num;
        }
        return result;
    }

    private static int[] intersection3(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int p = 0;
        for (int n : set1) {
            result[p++]=n;
        }
        return result;
    }
}
