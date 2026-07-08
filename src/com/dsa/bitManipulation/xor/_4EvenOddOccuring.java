package com.dsa.bitManipulation.xor;

public class _4EvenOddOccuring {
    /**
     * https://www.geeksforgeeks.org/problems/find-the-odd-occurence4820/1
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        System.out.println(getOddOccurrence(arr));  //3
    }

    private static int getOddOccurrence(int[] arr) {
        // code here
        int result = 0;
        for (int num : arr) {
            result = result ^ num;
        }
        return result;
    }
}
