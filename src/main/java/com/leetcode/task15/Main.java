package com.leetcode.task15;

import java.util.Arrays;
/*

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

*/
public class Main {

    public static void main(String[] args) {
        String s = "ABVGDEEZH";
        System.out.println(convert(s, 2));
    }

    public static String convert(String s, int numRows) {
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for(Character c : s.toCharArray()) {
            rows[currentRow].append(c);
            if(numRows != 1) {
                if(currentRow == 0 || currentRow == numRows - 1) {
                    goingDown = !goingDown;
                }
                currentRow += goingDown ? 1 : -1;
            }
        }

        StringBuilder result = new StringBuilder();
        Arrays.stream(rows).forEach(result::append);
        return result.toString();
    }
}
