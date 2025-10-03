package com.dsa.gfg.POTD;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterCircularArray {
    /**
     * Ques:
     * https://www.geeksforgeeks.org/problems/next-greater-element/1
     */
    public static ArrayList<Integer> nextGreater(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) result.add(-1); // Initialize with -1

        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[idx]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result.set(idx, arr[stack.peek()]);
            }
            stack.push(idx);
        }
        return result;
    }

    // Example usage:
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        ArrayList<Integer> res = nextGreater(arr);
        System.out.println(res); // Output: [3, 4, 4, -1]
    }
}
