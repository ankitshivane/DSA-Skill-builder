package com.coding.warmup;

public class _6MaxGapBetweenTwoSame {
    /**
     * GFG POD
     * https://www.geeksforgeeks.org/problems/maximum-number-of-characters-between-any-two-same-character4552/1
     */
    public static void main(String[] args) {
        String s = "socks";
        System.out.println(maxGap(s));
        System.out.println(maxGapOptimal(s));
    }

    private static int maxGapOptimal(String s) {
        int maxGapValue = -1;
        int n = s.length();

        // Array of size 26 to store the FIRST occurrence index of each character ('a' to 'z')
        int[] firstOccur = new int[26];

        // Initialize all values to -1 (meaning "not seen yet")
        for (int i = 0; i < 26; i++) {
            firstOccur[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int letterIndex = ch - 'a'; // Converts 'a' to 0, 'b' to 1, ..., 'z' to 25

            // If we haven't seen this character before, record its first position
            if (firstOccur[letterIndex] == -1) {
                firstOccur[letterIndex] = i;
            }
            // If we HAVE seen it before, calculate the gap instantly!
            else {
                int currentGap = i - firstOccur[letterIndex] - 1;
                if (currentGap > maxGapValue) {
                    maxGapValue = currentGap;
                }
            }
        }

        return maxGapValue;
    }

    // brute force approach
    private static int maxGap(String s) {
        int count = -1;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    int result = j - (i + 1);
                    if (result > count) {
                        count = result;
                    }
                }
            }
        }
        if (count == 0)
            return 0;
        else
            return count;
    }
}
