package com.dsa.beginners;

/*
Reverse A number in Java using diff approaches
 */
public class ReverseANumber {
    public static void main(String[] args) {
        int num = -44872;
        System.out.println("Approach 1: " + reverseNum1(num));
        System.out.println("Approach 2: " + reverseNum2(num));
        System.out.println("Approach 3: " + reverseNum3(num, 0));

    }

    // Approach:1
    private static int reverseNum1(int num) {
        num = Math.abs(num); // Taking care of negative num

        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10; // num=num/10;
        }

        return reversed;
    }

    private static int reverseNum2(int num) {
        // Alternate approach for converting negative num to positive
        if (num < 0) {
            num = num * -1;
        }
        return Integer.parseInt(new StringBuffer(String.valueOf(num)).reverse().toString());
    }

    // Approach:3
    private static int reverseNum3(int num, int reversed) {
        if (num < 0)
            num *= -1;
        if (num <= 0)
            return reversed;
        return reverseNum3(num / 10, reversed * 10 + num % 10);
    }

}
