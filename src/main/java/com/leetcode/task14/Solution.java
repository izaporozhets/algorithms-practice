package com.leetcode.task14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1Node = new ArrayList<>();
        List<Integer> list2Node = new ArrayList<>();

        while (l1.next != null){
            list1Node.add(l1.val);
            l1 = l1.next;
        }
        while (l2.next != null){
            list2Node.add(l2.val);
            l2 = l2.next;
        }
        Collections.reverse(list1Node);
        Collections.reverse(list2Node);
        String l1Val = list1Node.stream().map(String::valueOf).collect(Collectors.joining());
        String l2Val = list2Node.stream().map(String::valueOf).collect(Collectors.joining());
        String finalRes = Integer.valueOf(l1Val + l2Val).toString();

        ListNode newNode = new ListNode();
        newNode.val = finalRes.charAt(finalRes.length() - 1);
        for(int i = finalRes.length() - 2; i >= 0; i--) {
            newNode.next = new ListNode(Integer.parseInt(finalRes.charAt(i) + ""));
        }
        return newNode;
    }
}
