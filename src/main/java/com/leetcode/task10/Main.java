package com.leetcode.task10;

public class Main {
    public static void main(String[] args) {
        String input = "aabcccccaaaasdasdasdcddddfwqqweqsqwqqqq";
        System.out.println(compressString(input));
    }

    public static String compressString(String input) {
        if (input != null && input.length() > 1) {
            StringBuilder builder = new StringBuilder();
            char current = input.charAt(0);
            int count = 0;

            for(int i = 0; i < input.length(); ++i) {
                if (current == input.charAt(i)) {
                    ++count;
                } else {
                    builder.append(current).append(count);
                    count = 1;
                    current = input.charAt(i);
                }
            }

            builder.append(current).append(count);
            return builder.toString();
        } else {
            return input;
        }
    }
}