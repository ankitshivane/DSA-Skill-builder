package com.dsa.strings;

public class _2GfgConvertStringToLowerCase {
    /**
     * https://www.geeksforgeeks.org/problems/convert-string-to-lowercase/1
     */

    public static void main(String[] args) {
        String s = "ABCddE";
        System.out.println(convertToLowerCase2(s));
        System.out.println(convertToLowerCase(s));

        String s1 = "LMNOppQQ";
        System.out.println(convertToLowerCase2(s1));
        System.out.println(convertToLowerCase(s1));

        /*
        output:
abcdde
abcdde
lmnoppqq
lmnoppqq
         */
    }

    private static String convertToLowerCase(String s) {
        if (s == null) return null;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                char lower = (char) (arr[i] + 32);
                arr[i] = lower;
            }
        }

        return String.valueOf(arr);
    }


    // simply using a inbuilt function to convert string to lower case
    private static String convertToLowerCase2(String s) {
        return s.toLowerCase();
    }
}

