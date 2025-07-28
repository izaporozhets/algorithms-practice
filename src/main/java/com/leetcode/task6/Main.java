package com.leetcode.task6;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfValues = new String[]{"Common value", "Rare value", "Epic value", "Legendary value"};
        int[] arrayOfWeights = new int[]{100, 25, 5, 1};
        SpinArea spinArea = new SpinArea(arrayOfValues, arrayOfWeights);

        for(int i = 0; i < 20; ++i) {
            System.out.println(spinArea.getRandomValue());
        }

    }
}