package com.dsa.beginners;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestOfThree {
    public static void main(String[] args) {
        int n1 = 23, n2 = 89, n3 = 21;
        System.out.println(findLargestOfThree1(n1, n2, n3));
        System.out.println(findLargestOfThree2(n1, n2, n3));
        System.out.println(findLargestOfThree3(n1, n2, n3));
    }

    private static int findLargestOfThree1(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3)
            return n1;
        else if (n2 > n1 && n2 > n3)
            return n2;
        else
            return n3;
    }

    private static int findLargestOfThree2(int n1, int n2, int n3) {
        return Math.max(n1, Math.max(n2, n3));
    }

    private static int findLargestOfThree3(int n1, int n2, int n3) {
        return IntStream.of(n1, n2, n3).max().getAsInt();
    }

}
