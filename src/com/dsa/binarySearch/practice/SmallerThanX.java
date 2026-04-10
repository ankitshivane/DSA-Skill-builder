package com.dsa.binarySearch.practice;

public class SmallerThanX {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};
        int target = 10;
        System.out.println(countSmallerThanX(arr, target));
    }

    private static int countSmallerThanX(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;
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
