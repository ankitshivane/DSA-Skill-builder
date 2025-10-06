package com.dsa.array;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arraySortedOrNot(arr)); // true

        int[] arr2={1,2,1,3,4,5};
        System.out.println(arraySortedOrNot(arr2)); //false
    }
        private static boolean arraySortedOrNot(int[] arr) {
            // loop to check if any current element is lesser than its previous element then arr is not
            // sorted
            // Basically Iterate through the array to check for out-of-order elements".
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    return false;
                }
            }
            return true;
        }
}
