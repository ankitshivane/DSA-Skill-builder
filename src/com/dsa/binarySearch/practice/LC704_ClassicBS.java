package com.dsa.binarySearch.practice;

public class LC704_ClassicBS {
    /**
     * https://leetcode.com/problems/binary-search/description/
     * LC-704 Binary Search
     *
     */
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
