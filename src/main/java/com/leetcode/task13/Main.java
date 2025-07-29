package com.leetcode.task13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] res = solution.twoSum2(new int[]{2, 7, 11, 15}, 22);
        System.out.println(Arrays.toString(res));
    }
}