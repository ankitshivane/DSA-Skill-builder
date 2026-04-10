package com.dsa.binarySearch.practice;

public class SearchInsPos {
    /**
     * https://www.geeksforgeeks.org/dsa/search-insert-position-of-k-in-a-sorted-array/
     *
     * NOTES IF U R STRUGGLING WITH THE ALGORITHM DETECTION:
     * This problem is the perfect real-world application of Pattern 2:
     * Lower Bound.When you see a problem asking for a target or its insertion point, you are looking for the first index
     * where the value is greater than or equal to $k$.1. The Core InsightIn a sorted array, the "insertion point"
     * is simply the index of the first element that is currently bigger than your target.
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }

    private static int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
