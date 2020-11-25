package offer;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 链表中倒数第k个节点
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode22 {
    public static void main(String[] args) {

    }

    public ListNode getKthFromEnd(ListNode head, int k) {

        int firstStep = k;
        ListNode current = head;
        while (current != null && firstStep > 0) {
            current = current.next;
            firstStep--;
        }

        if (firstStep == 0) {
            while (current != null) {
                current=current.next;
                head=head.next;
            }
            return head;
        }
        return null;

    }
}
