package com.dsa.binarySearch.practice;

public class SmallerOrEqual {
    /**
     * https://www.geeksforgeeks.org/dsa/count-smaller-equal-elements-sorted-array/
     * In a sorted array, if the first element that is strictly greater than K is at index i,
     * then there are exactly 'i' elements that are <= K.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};
        int target = 3;
        System.out.println(countSmallerOrEqual(arr, target));
    }

    private static int countSmallerOrEqual(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
