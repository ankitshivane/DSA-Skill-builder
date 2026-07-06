package com.dsa.coding.warmup;

public class _2Replace0With5 {
    /**
     * https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=1&category=Arrays&difficulty=Basic&sortBy=submissions
     */

    public static void main(String[] args) {
        int n = 1004;
        System.out.println(replaceZeroWithFiveApproach1(n));
        System.out.println(replaceZeroWithFiveApproach2(n));
    }

    // Brute force approach
    private static int replaceZeroWithFiveApproach1(int n) {
        String s = String.valueOf(n);
        s = s.replaceAll("0", "5");
        return Integer.parseInt(s);
    }

    /**
     * Optimal approach with O(log n) time complexity and O(1) space complexity Mathematically, we can replace 0 with 5 by adding 5 to the number and then subtracting 5 from the number. For example, if the number is 1004, we can add 5 to it to get 1009, and then subtract 5 from it to get 1004. This way, we can replace all the 0s with 5s in O(log n) time complexity and O(1) space complexity.
     */

    private static int replaceZeroWithFiveApproach2(int n) {
        boolean isNegative = n < 0;
        n = Math.abs(n);
        if (n == 0) {
            return 5;
        }
        int result = 0;
        int place = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 0) {
                lastDigit = 5;
            }
            result = result + lastDigit * place;
            place *= 10;
            n = n / 10;
        }

        return result;
    }
}
