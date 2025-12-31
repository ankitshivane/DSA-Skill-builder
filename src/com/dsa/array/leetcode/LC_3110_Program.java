package com.dsa.array.leetcode;

import java.util.Arrays;

public class LC_3110_Program {
    /**
     * https://leetcode.com/problems/score-of-a-string/description/
     */
    public static void main(String[] args) {
        String s = "zaz";
        char[] charArray = s.toCharArray();
        int sum = 0;
        int left = 0;
        for (; left < s.length() - 1; left++) {
//            System.out.println(Math.abs(s.charAt(left) - s.charAt(left + 1)));
            sum += Math.abs(s.charAt(left) - s.charAt(left + 1));
        }
        System.out.println(sum);
    }
}
