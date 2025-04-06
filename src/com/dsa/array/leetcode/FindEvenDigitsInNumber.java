package com.dsa.array.leetcode;

/*
1295. Find Numbers with Even number of digits
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/]]
 */
public class FindEvenDigitsInNumber {
    public static void main(String[] args) {
        int[] ar = {12, 345, 2, 6, 7896, 4, 23, 222223};
        System.out.println(findNumbersWithEvenDigits(ar));
//        System.out.println(isEvenDigitCount(ar));
//        System.out.println("Number Of digits:" + findDigitUsingSimpleTrick(776));

    }

    private static int findNumbersWithEvenDigits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (digits(num) % 2 == 0)
                count++;
        }
        return count;
    }

    private static int digits(int num) {
        if (num < 0)
            num = num * -1;

        if (num == 0)
            return 1;

        int c = 0;
        while (num != 0) {
            num = num / 10;
            c++;
        }
        return c;
    }


    // Approach:2
    private static int isEvenDigitCount(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (String.valueOf(n).length() % 2 == 0)
                count++;
        }
        return count;
    }

    // using one trick find number of digits
    private static int findDigitUsingSimpleTrick(int num) {
        return (int) Math.log10(num) + 1;
    }
}
