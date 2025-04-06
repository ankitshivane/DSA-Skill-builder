package com.dsa.beginners;

import java.util.stream.IntStream;

public class NumOfEvenOddInNum {
    public static void main(String[] args) {
        int num = 351987348;
//        printNumberOfEvenAndOddInNumber1(num);
        printNumberOfEvenAndOddInNumber2(num);
        functionalStyleApproach(num);
    }

    private static void printNumberOfEvenAndOddInNumber1(int num) {
        num = Math.abs(num);
        int isEven = 0, isOdd = 0;
        while (num != 0) {
            int remainder = num % 10;
            if (remainder % 2 == 0)
                isEven++;
            else
                isOdd++;
            num = num / 10; // remove the last digit, dividing by 10
        }
        System.out.println("Even Count:" + isEven);
        System.out.println("Odd Count:" + isOdd);
    }

    private static void printNumberOfEvenAndOddInNumber2(int num) {
        num = Math.abs(num);
        String numStr = String.valueOf(num);
        int isOdd = 0;
        int isEven = 0;
        for (char ch : numStr.toCharArray()) {
            int n = ch - '0';
            if (n % 2 == 0)
                isEven++;
            else
                isOdd++;
        }
        System.out.println("Even Count:" + isEven);
        System.out.println("Odd Count:" + isOdd);
    }

    private static void functionalStyleApproach(int num) {
        long evenNumCount = String.valueOf(num).chars().map(i -> (i - '0')).filter(i -> i % 2 == 0).count();
        // You can get number of digits using this approach
//        int numberOfDigits = (int) Math.log10(num) + 1;
//        int oddNum = numberOfDigits - (int) evenNumCount;

        // OR using below approach
        long oddNum = String.valueOf(Math.abs(num)).length() - evenNumCount;

        System.out.println("Even Count:" + evenNumCount);
        System.out.println("Odd Count:" + oddNum);
    }

}