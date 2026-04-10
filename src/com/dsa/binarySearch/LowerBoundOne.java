package com.dsa.binarySearch;

public class LowerBoundOne {
    public static void main(String[] args) {
        int[] arr = {2,5,5,5,8};
        int target = 4;
        int ans = findLowerBoundIndex(arr, target, arr.length);
        System.out.println(ans);
    }

    private static int findLowerBoundIndex(int[] arr, int target, int n) {
        int ans = n;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1; // as we need to find the lowest index so there is probability that the lowest index might exists so adjusting the high value again to search.
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
