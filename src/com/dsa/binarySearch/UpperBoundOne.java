package com.dsa.binarySearch;

public class UpperBoundOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};
        int target = 10;
        System.out.println(upperBound(arr, target));
    }

    static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) low = mid + 1;  // Move right
            else high = mid;  // Move left
        }

        return low;  // Low holds the first position AFTER the last occurrence
    }

}
