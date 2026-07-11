package com.dsa.strings;

public class _1GFGLastOne {
    /**
     * https://www.geeksforgeeks.org/problems/last-index-of-15847/1
     */
    public static void main(String[] args) {
        String s = "00001";
        System.out.println(lastIndex(s)); //4
        System.out.println(lastIndex2(s));
    }

    //optimal
    private static int lastIndex(String s) {
        return s.lastIndexOf("1");
    }

    private static int lastIndex2(String s) {
        char[] chArr = s.toCharArray();
        for (int i = chArr.length - 1; i >= 0; i--) {
            if (chArr[i] == '1') {
                return i;
            }
        }
        return -1;
    }


}
