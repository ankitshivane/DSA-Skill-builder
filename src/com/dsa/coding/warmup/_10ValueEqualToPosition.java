package com.dsa.coding.warmup;

import java.util.ArrayList;

public class _10ValueEqualToPosition {
    /**
     * Value equal to position
     * https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&category=Arrays,Strings&difficulty=Basic&sortBy=submissions
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {15, 2, 45, 4, 7};
        System.out.println(valueEqualToPosition(arr)); // [2, 4]
    }

    private static ArrayList<Integer> valueEqualToPosition(int[] arr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                numbers.add(arr[i]);
            }
            num++;
        }
        return numbers;
    }
}
