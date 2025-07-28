package com.leetcode.task12;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "tactcoa";
        String input2 = "mmo";
        String input3 = "radra";
        System.out.println(isPalindromePossible("100"));
        System.out.println(isPalindromePossible(input2));
        System.out.println(isPalindromePossible(input3));
    }

    public static boolean isPalindromePossible(String input) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < input.length(); ++i) {
            map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
        }

        int count = 0;

        for(Integer value : map.values()) {
            if (value % 2 != 0) {
                ++count;
            }
        }

        return count <= 1;
    }

    public static String longestPalindrome(String s) {
        if (s != null && !s.isEmpty()) {
            int start = 0;
            int end = 0;

            for(int i = 0; i < s.length(); ++i) {
                int evenLength = expandFromCenter(s, i, i);
                int oddLength = expandFromCenter(s, i, i + 1);
                int len = Math.max(evenLength, oddLength);
                if (len > end - start) {
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                }
            }

            return s.substring(start, end + 1);
        } else {
            return "";
        }
    }

    public static int expandFromCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }

        return right - left - 1;
    }
}