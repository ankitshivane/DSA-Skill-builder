package com.dsa.binarySearch;

public class LastOccurrenceBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 5, 6, 7, 8, 9};
        int target = 5;
        int ans = binarySearchLastOccurrence(arr, target);
        System.out.println(ans);
    }

    private static int binarySearchLastOccurrence(int[] arr, int target) {
        int answer = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                answer = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }

}
