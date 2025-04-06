package com.dsa.beginners;

import java.security.SecureRandom;
import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(reverseStr1(str));
        System.out.println(reverseStr2(str));
        System.out.println(reverseStr3(str));
        System.out.println(reverseStr4(str));
        System.out.println(reverseStr5(str));
    }

    //Approach 1
    private static String reverseStr1(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }

    // Approach 2
    private static String reverseStr2(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chArr = str.toCharArray();
        for (int i = chArr.length - 1; i >= 0; i--) {
            sb.append(chArr[i]);
        }
        return sb.toString();
    }

    // Approach 3
    private static String reverseStr3(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] chArr = str.toCharArray();
        while (left < right) {
            char temp = str.charAt(left);
            chArr[left] = chArr[right];
            chArr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(chArr);
    }

    // Approach 4
    private static String reverseStr4(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Approach 5
    private static String reverseStr5(String str) {
        Stack<Character> characterStack = new Stack<>();
        for (char ch : str.toCharArray()) {
            characterStack.push(ch);
        }

        String reversed = "";
        while (!characterStack.isEmpty()) {
            reversed += characterStack.pop();
        }
        return reversed;

    }
}
