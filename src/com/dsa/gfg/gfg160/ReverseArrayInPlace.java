package com.dsa.gfg.gfg160;

import java.util.Arrays;

public class ReverseArrayInPlace {
    /**
     * Ques:
     * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
    }

    public static void reverseArray(int arr[]) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        for (; left < arr.length; left++) {
            if (left > right) {
                break;
            }
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
        }
        System.out.print(Arrays.toString(arr));
    }

}
