package com.dsa.sorting.selection;

import java.util.Arrays;

public class PracticeAlgo1 {
    public static void main(String[] args) {
        int[] arr = {13, 42, 24, 92, 56, 9};
        int[] res1 = selectionSort1(arr);
        System.out.println(Arrays.toString(res1)); // [9, 13, 24, 42, 56, 92]
        // Below working is same but little optimize
        int[] res2 = selectionSort2(arr);
        System.out.println(Arrays.toString(res2)); // [9, 13, 24, 42, 56, 92]

    }

    // selection sort algorithm implementation-1
    private static int[] selectionSort1(int[] nums) {
        for (int i = 0; i <= nums.length - 2; i++) {
            int min = findMin(nums, i);
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }

    private static int findMin(int[] arr, int startPos) {
        int min = arr[startPos];
        int minIndex = startPos;
        for (int i = startPos; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int[] selectionSort2(int[] nums) {
        for (int i = 0; i <= nums.length - 2; i++) {

            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
}
