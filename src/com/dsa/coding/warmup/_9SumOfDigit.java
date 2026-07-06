package com.dsa.coding.warmup;

public class _9SumOfDigit {
    public static void main(String[] args) {
        int num = 654910;
        System.out.println(sumOfDigit1(num)); // 25
        System.out.println(sumOfDigitRecursive(num)); // 25
    }

    private static int sumOfDigit1(int num) {
        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10;
        }
        return sum;
    }

    private static int sumOfDigitRecursive(int num) {
// base condition
        if (num == 0) {
            return 0;
        }

        return num % 10 + sumOfDigitRecursive(num / 10);
    }
}
