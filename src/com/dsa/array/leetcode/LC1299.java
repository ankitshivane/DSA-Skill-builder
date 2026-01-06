package com.dsa.array.leetcode;

import java.util.Arrays;

public class LC1299 {
    /**
     * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] nums) {
        int n = nums.length * 2;
        int[] arr = new int[n];
        System.out.println(nums.length);
        int pointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pointer == nums.length) {
                pointer = 0;
            }
            arr[i] = nums[pointer];
            pointer++;
        }
        return arr;
    }
}
