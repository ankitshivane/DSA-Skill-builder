package com.dsa.coding.warmup;

public class _8reverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverseNumApproachBruteForce(num)); // 54321
        System.out.println(reverseNumOptimal(num)); // 54321
    }

    private static int reverseNumApproachBruteForce(int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    private static int reverseNumOptimal(int num) {
        int result = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            result = lastDigit + result * 10;
            num = num / 10;
        }
        return result;
    }
}
