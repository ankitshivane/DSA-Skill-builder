package com.dsa.array.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class LC242_ValidAnagram {
    /**
     * https://leetcode.com/problems/valid-anagram/description/
     *
     * @param args
     */
    public static void main(String[] args) {
        String s = "ab";
        String t = "ba";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram2(s, t));
        System.out.println(isAnagram3(s, t));
    }

    /**
     * This is optimized approach where used hashmap to store the count of every character in 's' string
     * then check for every letter in 't' string inside map
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!counter.containsKey(t.charAt(i)) || counter.get(t.charAt(i)) == 0) {
                return false;
            }
            counter.put(t.charAt(i), counter.get(t.charAt(i)) - 1);
        }
        return true;
    }

    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        return new String(s1).equalsIgnoreCase(new String(t1));
    }

    /**
     * This is brute force algorithm
     * where im using nested loops to compare every letter of the 's' string with the every other letter of 't' string if match is found then its anagram else
     * its not an anagram
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int n1 = s.length();
        int n2 = t.length();
        for (int i = 0; i < n1; i++) {
            char current = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < n2; j++) {
                if (current == t.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
