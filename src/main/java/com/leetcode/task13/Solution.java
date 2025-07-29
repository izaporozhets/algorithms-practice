package com.leetcode.task13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; ++i) {
            for(int j = i + 1; j < nums.length; ++j) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; ++i) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[0];
    }
}