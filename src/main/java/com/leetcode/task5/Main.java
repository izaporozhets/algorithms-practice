package com.leetcode.task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int valueToRemove = 2;
        Arrays.stream(testArray).filter((n) -> n != valueToRemove).sorted().forEach(System.out::println);
    }
}
