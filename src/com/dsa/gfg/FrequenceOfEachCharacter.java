package com.dsa.gfg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenceOfEachCharacter {
    public static void main(String[] args) {
        String s = "elephant";
        freqOfChar1(s);
        System.out.println();
        freqOfChar2(s);
        System.out.println();
        freqOfChar3(s);
    }

    // solution using Hashing approach
    private static void freqOfChar1(String s) {
        LinkedHashMap<Character, Integer> counter = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue() + " "); //g2 e4 k2 s2 f1 o1 r1
        }
    }

    // brute force using nested loop
    private static void freqOfChar2(String s) {
        int n = s.length();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            if (visited[current - 'a'])
                continue;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    visited[current - 'a'] = true;
                }
            }
            System.out.print(s.charAt(i) + "" + count + " ");
        }
    }

    private static void freqOfChar3(String s) {
        int[] frequency = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (frequency[s.charAt(i) - 'a'] != 0) {
                System.out.print(s.charAt(i) + "" + frequency[s.charAt(i) - 'a'] + " ");
                frequency[s.charAt(i) - 'a'] = 0;
            }
        }
    }
}