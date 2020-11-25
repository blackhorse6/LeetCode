package offer;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode24 {
    public static void main(String[] args) {

        ListNode node = ListNode.generateNode(new int[]{1, 2, 3, 4, 5});
        ListNode reverseList = reverseList(node);
        ListNode.printNode(reverseList);

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return pre;
    }
}
