package com.leetcode.task3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] inputStrings = new String[]{"Test", "CommonTest", "PlayTest", "DnaTest", "PrettyLongTest", "T"};
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.length() == o2.length() ? 0 : 1;
                }
            }
        };
        Arrays.stream(inputStrings).sorted(comparator).forEach(System.out::println);
    }
}