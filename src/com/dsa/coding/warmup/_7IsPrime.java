package com.dsa.coding.warmup;

public class _7IsPrime {
    public static void main(String[] args) {
        int number = 11;
        System.out.println(isPrime(number)); // true
        System.out.println(isPrimeOptimized(number)); // true
    }

    // below solution is brute force solution, we can optimize it by checking only up to the square root of the number
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeOptimized(int number) {
        if (number <= 1) {
            return false;
        }

        // here we are checking only up to the square root of the number, because if a number is not prime,
        // it can be factored into two factors, at least one of which must be less than or equal to the square root of the number.

        /**by math we can say that if a number n is not prime then it will have a factor less than or equal to sqrt(n) which divides n without leaving a remainder.
         * So we can check only up to the square root of the number to determine if it is prime or not.
         */

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
