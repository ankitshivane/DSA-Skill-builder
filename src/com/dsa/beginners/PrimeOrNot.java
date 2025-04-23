package com.dsa.beginners;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        /*
        if (count > 2)
            return false;
        return true;
        */
        //OR
        return count == 2;
    }
}
