package com.dsa.binarySearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 12, 19, 25, 29, 31, 35, 40};
        int target = 88;
        System.out.println(findIndexOfElement(arr, target));
    }

    private static int findIndexOfElement(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int midIndx = (low + high) / 2;
            if (target == arr[midIndx]) //means we found the element
                return midIndx;
            else if (target > arr[midIndx])
                low = midIndx + 1;  // means target present at the right side of the mid element of array so shift the position of low to ride ride of mid as our mid is not the target element.
            else
                high = midIndx - 1; // it means target element is less than the mid element of array, so low will remain at its position and its time to change high index.
        }
        return -1; // If Element not present in array then return -1
    }
}
