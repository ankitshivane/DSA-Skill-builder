package com.dsa.beginners;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(findSumOfDigits1(num));
        System.out.println(findSumOfDigits2(num));
        System.out.println(findSumOfDigitUsingRecursion(num, 0));
    }

    private static int findSumOfDigits1(int num) {
        return String.valueOf(num).chars().map(i -> (int) i - '0').sum();
    }

    private static int findSumOfDigits2(int num) {
        num = Math.abs(num);
        int sum = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10;
        }
        return sum;
    }

    private static int findSumOfDigitUsingRecursion(int num, int sum) {
        if (num == 0)
            return sum;
        return findSumOfDigitUsingRecursion(num / 10, sum + num % 10);
    }
}
