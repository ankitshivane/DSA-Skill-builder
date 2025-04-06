package com.dsa.array;

import java.util.Arrays;

public class BasicsArray {
    public static void main(String[] args) {
//        arrayBasics();
//        ex1();
//        twoDAr1();
//        System.out.println(checkIfElePresentInRange(new int[]{18, 12, -7, 3, 14, 28}, 3, 1, 4));
        System.out.println(findMin(new int[]{18, 12, -7, 3, 14, 28}));
    }

    private static void arrayBasics() {
        // Declaration and initialization
        int[] arr = {1, 2, 3};
        // Declaration of array a of 3 size. means it will have a capacity of holding 3 elements in it.
        int[] a = new int[3];
        // Declaration and initialization
        int[] b = new int[]{1, 2, 3, 4};
        Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(a).forEach(System.out::println);
        Arrays.stream(b).forEach(System.out::println);
        // Here we are initializing an array which we declared above
        a[0] = 2;
        a[1] = 12;
        a[2] = 3;
        Arrays.stream(a).forEach(System.out::println);

        // declaration in two different state, here we are just declaring a variable
        int[] c;
        // actual Object is getting created here in Heap Memory and the variable is pointing to that object
        c = new int[8];
    }

    private static void ex1() {
        System.out.println("--------------");
        int[] ar = new int[10];
        long[] lr = {1, 2, 3};
        char[] cr = new char[3];
        Character[] chr = new Character[23];
        System.out.println(ar);
        System.out.println(lr);
        System.out.println(cr);
        System.out.println(chr);
        for (char c : cr) {
            System.out.println(c);
        }
    }

    private static void twoDAr1() {
        int[][] ar = {
                {223, 12, 33, 2},
                {55, 32, 5},
                {99, 87, 8976, 9}
        };
        System.out.println(ar.length);
        System.out.println("First row size:" + ar[0].length);
        System.out.println("Sec row size:" + ar[1].length);
        System.out.println("Third row size:" + ar[2].length);
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int checkIfElePresentInRange(int[] arr, int target, int startIndex, int endIndex) {
        if (endIndex > arr.length || (startIndex < 0 || startIndex > arr.length))
            return Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (startIndex <= i && endIndex >= i) {
                if (arr[i] == target)
                    return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    static int checkIfElePresentInRangeV2(int[] arr, int target, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == target)
                return i;
        }
        return Integer.MAX_VALUE;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min)
                min = n;
        }
        return min;
    }
}