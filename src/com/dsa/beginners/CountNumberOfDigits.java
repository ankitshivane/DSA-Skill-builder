package com.dsa.beginners;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        int num = 8727682;
        System.out.println(countDigit1(num));
        System.out.println(countDigit2(num));
        System.out.println(countDigit3(num));
        System.out.println(countDigitUsingRecursion(num, 0));
    }

    // Approach 1
    private static int countDigit1(int num) {
        num = Math.abs(num);
        if (num == 1)
            return 0;
        return String.valueOf(num).length();
    }

    //Approach 2
    private static int countDigit2(int num) {
        num = Math.abs(num);
        if (num == 1) {
            return 1;
        }
        return (int) Math.log10(num) + 1;
    }

    // Approach 3
    private static int countDigit3(int num) {
        if (num < 0)
            num *= -1;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // Approach 4
    private static int countDigitUsingRecursion(int num, int count) {
        num = Math.abs(num);
        if (num == 0)
            return count;
        return countDigitUsingRecursion(num / 10, count + 1);
    }
}