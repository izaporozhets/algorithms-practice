package com.leetcode.task18;

public class Main {
    public static void main(String[] args) {
        String haystack = "butsadsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        int index = 0;

        while(!haystack.startsWith(needle)){
            haystack = haystack.substring(1);
            index++;
        }

        return index;
    }
}
