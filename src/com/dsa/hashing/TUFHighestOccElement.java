package com.dsa.hashing;

public class TUFHighestOccElement {
    /**
     * https://takeuforward.org/plus/dsa/problems/highest-occurring-element-in-an-array?category=beginner-problem&subcategory=basic-hashing
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,2,2};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
    }


    private static int approach2(int[] nums) {
        int maxCnt = 0;
        int el = -1;
        int n = nums.length;
        int[] hash = new int[findMax(nums, n) + 1];
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (maxCnt < hash[i]) {
                maxCnt = hash[i];
                el = i;
            } else if (maxCnt == hash[i] && i < el) {
                el = i;
            }
        }
        return el;
    }

    private static int approach1(int[] nums) {
        int n = nums.length;
        int[] visited = new int[findMax(nums, n) + 1];
        int maxCnt = 0;
        int el = -1;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            if (visited[nums[i]] == 0) {
                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        cnt++;
                    }
                }
                if (maxCnt < cnt) {
                    maxCnt = cnt;
                    el = nums[i];
                } else if (maxCnt == cnt && nums[i] < el) {
                    el = nums[i];
                }
            }
        }
        return el;
    }

    private static int findMax(int[] arr, int n) {
        int maxElement = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
