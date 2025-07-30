package com.leetcode.task17;


import com.leetcode.task14.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    /*

    Merge the two lists into one sorted list.
    The list should be made by splicing together the nodes of the first two lists.

    */
    public static void main(String[] args) {
        ListNode ls1 = new ListNode(1);
        ls1.next = new ListNode(2);
        ls1.next.next = new ListNode(3);
        ls1.next.next.next = new ListNode(4);

        ListNode ls2 = new ListNode(4);
        ls2.next = new ListNode(5);
        ls2.next.next = new ListNode(3);
        ls2.next.next.next = new ListNode(1);

        Solution solution = new Solution();
        List<Integer> result = solution.mergeTwoLists(ls1, ls2);
        System.out.println(result);
    }

    public List<Integer> mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) { return Collections.emptyList(); }

        List<Integer> resultList = new ArrayList<>();
        while (list1 != null ) {
            resultList.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null ) {
            resultList.add(list2.val);
            list2 = list2.next;
        }
        resultList.sort(Integer::compare);
        return resultList;
    }
}
