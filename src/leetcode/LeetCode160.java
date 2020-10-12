package leetcode;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 相交链表
 * ----      Description     ----
 * 编写一个程序，找到两个单链表相交的起始节点。
 * ----      Example         ----
 */
public class LeetCode160 {
    public static void main(String[] args) {

        ListNode node1 = ListNode.generateNode(new int[]{4, 1, 8, 4, 5});
        ListNode node2 = ListNode.generateNode(new int[]{5, 6, 1, 8, 4, 5});
        getIntersectionNode(node1, node2);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode head1 = headA;
        ListNode head2 = headB;
        int h1 = 0;
        int h2 = 0;
        while (head1 != null) {
            h1++;
            head1 = head1.next;
        }
        while (head2 != null) {
            h2++;
            head2 = head2.next;
        }
        int diff = h1 - h2;
        if (diff > 0) {
            while (headA != null && diff > 0) {
                headA = headA.next;
                diff--;
            }
        } else {
            while (headB != null && diff < 0) {
                headB = headB.next;
                diff++;
            }
        }
        while (headA != null && headB != null) {
            if (headA.val == headB.val) {
                return headA.next;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
