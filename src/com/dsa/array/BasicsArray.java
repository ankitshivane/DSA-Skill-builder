package com.dsa.array;

import java.util.Arrays;

public class BasicsArray {
    public static void main(String[] args) {
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
}
