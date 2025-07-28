package com.leetcode.task11;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String input = "abcbcbbcbabav";
        System.out.println(longestNonRepeatableSubstring(input));
    }

    public static int longestNonRepeatableSubstring(String s) {
        int left = 0;
        int maxSize = 0;
        Set<Character> seen = new HashSet<>();

        for(int right = 0; right < s.length(); ++right) {
            while(seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                ++left;
            }

            seen.add(s.charAt(right));
            maxSize = Math.max(maxSize, right - left + 1);
        }

        return maxSize;
    }
}