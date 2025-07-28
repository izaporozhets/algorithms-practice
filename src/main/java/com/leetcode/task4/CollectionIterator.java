package com.leetcode.task4;

import java.util.Iterator;

public class CollectionIterator implements Iterator<String> {
    int i = 0;
    String[] strArr;

    public CollectionIterator(String[] strArr) {
        this.strArr = strArr;
    }

    public boolean hasNext() {
        return this.i < this.strArr.length;
    }

    public String next() {
        return this.strArr[this.i++];
    }
}