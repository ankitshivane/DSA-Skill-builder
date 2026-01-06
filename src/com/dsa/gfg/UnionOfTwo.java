package com.dsa.gfg;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 4, 43, 5, 2, 6};
        System.out.println(findUnion1(a, b));
    }

    private static void findUnion2(int[] a, int[] b) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
    }

    private static ArrayList<Integer> findUnion1(int[] a, int[] b) {
        int[] result = new int[Math.max(a.length, b.length)];
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    ls.add(a[i]);
                }
            }
        }
        return ls;
    }
}
