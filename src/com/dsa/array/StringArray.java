package com.dsa.array;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String name = "ankit";
        char target = 'z';
        int indexOfChar = findIndexOfChar(name, target);
        System.out.println(indexOfChar);
        System.out.println(checkIfCharPresent(name, target));
        char[] charArray = name.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }

    // Check whether the target character present in the given name. if present return true else false.
    static boolean checkIfCharPresent(String name, char target) {
        for (char ch : name.toCharArray()) {
            if (ch == target)
                return true;
        }
        return false;
    }

    // Find the index of the target char in the given name
    static int findIndexOfChar(String name, char target) {
        if (name == null || name.isEmpty())
            return Integer.MAX_VALUE;

        char[] names = name.toCharArray();
        for (int i = 0; i < names.length; i++) {
            if (names[i] == target)
                return i;
        }
        return Integer.MAX_VALUE;
    }
}
