package com.dsa.recursion;

public class SummationOfFirstNNumbers {
    public static void main(String[] args) {
//        System.out.println(summationOfNNumbWithoutRec(4));
        System.out.println(sumOfFirstNNum(4));
    }

    private static int sumOfFirstNNum(int n) {
        if (n < 1)
            return 0;

        // Do this
//        n = n + sumOfFirstNNum(n - 1);
        // Or like below here, in --n it will first reduce the value by 1 and then pass it as argument
        n = n + sumOfFirstNNum(--n);
        return n;
    }

    // using non-recursion approach
    private static int summationOfNNumbWithoutRec(int n) {
        int sum = 0;
        // using while loop

        /*while (n >= 1) {
            sum = sum + n;
            n--;
        }*/

        // Using for loop
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
