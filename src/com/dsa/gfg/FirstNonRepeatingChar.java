package com.dsa.gfg;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "swiss";
        firstNonRepeatingChar1(s);
        firstNonRepeatingChar2(s);
        firstNonRepeatingChar3(s);
    }

    // optimal
    private static void firstNonRepeatingChar1(String s) {
        LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> count : freq.entrySet()) {
            if (count.getValue() == 1) {
                System.out.println(count.getKey());
                break;
            }
        }
    }

    private static void firstNonRepeatingChar2(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (current == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(current);
                break;
            }
        }
    }

    private static void firstNonRepeatingChar3(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
