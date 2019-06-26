package com.dl.zz.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @Author zenghzong
 * @Since 2019/6/26
 * @Version 1.0
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
    this.val = val;
    }
}