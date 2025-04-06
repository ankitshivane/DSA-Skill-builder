package com.dsa.recursion;

public class FactorialOfN {
    public static void main(String[] args) {
//        System.out.println(factorialOfN(5));
        System.out.println(factOfNUsingParamWay(5,5));
    }

    // using functional way
    private static int factorialOfN(int n) {
        if (n == 1) {
            return n;
        }
        n = n * factorialOfN(n - 1);
        return n;
    }

    private static int factOfNUsingParamWay(int n, int f) {
        if (f == 1)
            return f;
        f = f * factOfNUsingParamWay(n, f - 1);
        return f;
    }
}
