package com.dsa.array;

import java.util.Arrays;

public class InsertInArrayAtGivenPos {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 2;
        arr[1] = 55;
        arr[2] = 20;
        System.out.println(Arrays.toString(arr));
        int pos = 2;
        int valToInsert=23;
        int[] res = insertAtGivenPos(arr, pos, valToInsert);
        System.out.println(Arrays.toString(res));
    }

    private static int[] insertAtGivenPos(int[] arr, int pos,int val) {
        if(pos>arr.length){
            return new int[]{};
        }
        if (arr[pos] != 0) {
            int temp=arr[pos];
            arr[pos]=val;
            arr[pos+1]=temp;
        }
        return arr;
    }
}
