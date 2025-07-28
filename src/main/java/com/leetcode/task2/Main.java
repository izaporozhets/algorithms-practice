package com.leetcode.task2;

public class Main {
    public static void main(String[] args) {
        String validInput = "()(()())((()))(())";
        String invalidInput = "()(()))))(()()";
        boolean result = isValidStr(validInput);
        System.out.println("valid : " + result);
    }

    public static boolean isValidStr(String str) {
        int openBracetCount = 0;
        int closedBracetCount = 0;

        for(int i = 0; i < str.length(); ++i) {
            if (openBracetCount < closedBracetCount) {
                return false;
            }

            if (str.charAt(i) == '(') {
                ++openBracetCount;
            } else {
                ++closedBracetCount;
            }
        }

        return openBracetCount == closedBracetCount;
    }
}