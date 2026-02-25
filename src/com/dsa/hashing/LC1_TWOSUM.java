package com.dsa.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1_TWOSUM {
    /**
     * https://leetcode.com/problems/two-sum/description/
     */
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    /**
     * its a brute force solution wont work for large array or large values
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum1(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = (i + 1); j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{-1, -1};
    }


    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (mp.containsKey(needed)) {
                return new int[]{mp.get(needed), i};
            }
            mp.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
