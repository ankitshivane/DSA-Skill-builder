package com.dsa.strings;

import java.util.HashMap;
import java.util.Map;

public class _3GfgUncommonCharacters {
    /**
     * https://www.geeksforgeeks.org/problems/uncommon-characters4932/1
     */
    public static void main(String[] args) {
        String s1 = "characters";
        String s2 = "alphabets";
        System.out.println(uncommonCharacters3(s1, s2));
        System.out.println(uncommonCharactersWithTreeSet(s1, s2));
        System.out.println(uncommonCharactersSorted(s1, s2));
    }


    private static String uncommonCharacters3(String s1, String s2) {
        int[] arr = new int[26];
        for (char c : s1.toCharArray()) {
            if (!s2.contains(c + "") && arr[c - 'a'] == 0) {
                arr[c - 'a']++;
            }
        }

        for (char c : s2.toCharArray()) {
            if (!s1.contains(c + "") && arr[c - 'a'] == 0) {
                arr[c - 'a']++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }

    private static String uncommonCharactersWithTreeSet(String s1, String s2) {
        boolean[] p1 = new boolean[256];
        boolean[] p2 = new boolean[256];
        for (char c : s1.toCharArray()) p1[c] = true;
        for (char c : s2.toCharArray()) p2[c] = true;

        // TreeSet sorts characters naturally
        java.util.Set<Character> set = new java.util.TreeSet<>();
        for (int i = 0; i < 256; i++) {
            if (p1[i] ^ p2[i]) set.add((char) i);
        }

        if (set.isEmpty()) return "-1";
        StringBuilder sb = new StringBuilder();
        for (char c : set) sb.append(c);
        return sb.toString();
    }

    private static String uncommonCharactersSorted(String s1, String s2) {
        boolean[] p1 = new boolean[26];
        boolean[] p2 = new boolean[26];

        for (char c : s1.toCharArray()) {
            if (c >= 'a' && c <= 'z') p1[c - 'a'] = true;
            else if (c >= 'A' && c <= 'Z') p1[c - 'A'] = true; // if you want to support uppercase
        }
        for (char c : s2.toCharArray()) {
            if (c >= 'a' && c <= 'z') p2[c - 'a'] = true;
            else if (c >= 'A' && c <= 'Z') p2[c - 'A'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (p1[i] ^ p2[i]) { // present in exactly one of the strings
                sb.append((char) ('a' + i));
            }
        }
        return sb.length() == 0 ? "-1" : sb.toString();
    }

}
