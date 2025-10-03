package com.dsa.gfg.gfg160;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharStr {
    /**
     * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/non-repeating-character-1587115620
     */
    public static void main(String[] args) {
        char c = nonRepeatingChar("geeksforgeeks");
        System.out.print(c);
    }

    public static char nonRepeatingChar(String s) {
        // code here
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '$';
    }
}
