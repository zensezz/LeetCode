package com.dl.zz;

/**
 * @Author zenghzong
 * @Since 2019/6/25
 * @Version 1.0
 */
public class Question2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode(0);
        int count = 0;
        ListNode l3 = resultList;
        while (l1 != null || l2 != null || count > 0){
            int l1val = l1 == null ? 0 : l1.val;
            int l2val = l2 == null ? 0 : l2.val;
            int l3val = l1val + l2val + count;
            count = 0;
            if (l3val >=  10){
                count = 1;
                l3val = l3val - 10;
            }
            l3.next = new ListNode(l3val);
            l3 = l3.next;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        return resultList.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
