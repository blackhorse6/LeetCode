package leetcode;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Description     ----
 * 反转一个单链表。
 * ----      Example         ----
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class LeetCode206 {
    public static void main(String[] args) {
        int[] aar = {1, 2, 3, 4, 5, 6};
        ListNode listNode = ListNode.generateNode(aar);
        ListNode.printNode(listNode);
        ListNode reverseList = reverseList(listNode);
        ListNode.printNode(reverseList);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
