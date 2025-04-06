package com.dsa.array;

import java.util.Arrays;

public class SecondLargestInArr {
    public static void main(String[] args) {
//        int[] nums = {12, 35, 1, 10, 34, 1};
        int[] nums = {10, 5, 10};
//        System.out.println("Approach 1->" + findSecondLargNumApproach2(nums));
//        System.out.println("Approach 2->" + findSecondLargestNum(nums));
        System.out.println("Approach 3->" + findSecLargestNumApproach3(nums));
    }

    private static int findSecondLargNumApproach2(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int secLargest = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest)
                return arr[i];
        }
        return 0;
    }

    private static int findSecondLargestNum(int[] arr) {
        int maxNum = arr[0];
        for (int i : arr) {
            if (i > maxNum)
                maxNum = i;
        }
        int secMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > secMax && i != maxNum)
                secMax = i;
        }
        return secMax;
    }

    private static int findSecLargestNumApproach3(int[] arr) {
        int max = arr[0], secLarg = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                secLarg = max;
                max = i;
            }
        }
        return secLarg;
    }
}