package com.coding.warmup;

public class _4FirstOccurrence {
    public static void main(String[] args) {
        String txt = "GeeksforGeeks";
        String pat = "for";
        System.out.println(firstOccurrence(txt, pat));
        System.out.println(firstOccurrenceOptimal(txt, pat));
    }

    //Brute force approach with O(n*m) time complexity and O(1) space complexity
    private static int firstOccurrence(String txt, String pat) {
        int n1 = txt.length();
        int n2 = pat.length();
        int index = -1;
        for (int i = 0; i < n1; i++) {
            int ii = i;
            boolean flag = false;
            for (int j = 0; j < n2; j++) {
                if (ii < n1 && txt.charAt(ii) == pat.charAt(j)) {
                    flag = true;
                    ii++;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                index = i;
                return index;
            }
        }
        return -1;
    }

    private static int firstOccurrenceOptimal(String txt, String pat) {
        int n1 = txt.length();
        int n2 = pat.length();
        if (n2 > n1) {
            return -1;
        }

        // here we are subtracting n2 from n1 because we don't need to check the last n2 characters of txt if pat is longer than the remaining characters in txt
        for (int i = 0; i <= n1 - n2; i++) {
            int j;
            for (j = 0; j < n2; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            // TRICK: If the inner loop finished completely without breaking,
            // it means j reached equal to n2. That means we found a perfect match!
            // if j < n2, it means we have not found the first occurrence of pat in txt, so we continue to the next iteration of the outer loop
            if (j == n2) {
                return i;
            }
        }

        return -1;
    }

}
