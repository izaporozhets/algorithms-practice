package com.leetcode.task4;

public class Main {
    public static void main(String[] args) {
        String[] inputStrings = new String[]{"Test ", "for ", "a ", "custom ", "array ", "iterator."};
        CollectionIterator itr = new CollectionIterator(inputStrings);

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}