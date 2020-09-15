package leetcode;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-06-09
 * ----      Title           ----
 * 删除链表的倒数第N个节点
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode19 {
    public static void main(String[] args) {
        ListNode node = removeNthFromEnd(ListNode.generateNode(new int[]{1}), 1);
        ListNode node1 = removeNthFromEnd(ListNode.generateNode(new int[]{1, 2, 3, 4, 5}), 5);
        ListNode.printNode(node);
        ListNode.printNode(node1);

    }

    /**
     * 快慢指针
     * 删除头
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode first = node;
        ListNode second = node;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return node.next;
    }

}
