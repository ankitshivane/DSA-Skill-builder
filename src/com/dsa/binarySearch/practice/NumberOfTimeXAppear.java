package com.dsa.binarySearch.practice;

public class NumberOfTimeXAppear {
    /**
     * Given a sorted array with duplicates, count the number of occurrences of a given number X.
     *
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 8, 8, 10, 10, 10, 11};
        int target = 10;
        System.out.println(countOccurrences(arr, target));
    }

    private static int countOccurrences(int[] arr, int target) {
        int lowerBound = LB(arr, target);
        int upperBound = UB(arr, target);

        return upperBound - lowerBound;
    }


    private static int LB(int[] arr, int target) {
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


    private static int UB(int[] arr, int target) {
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
