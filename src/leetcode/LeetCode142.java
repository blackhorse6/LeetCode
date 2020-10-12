package leetcode;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 环形链表 II
 * ----      Description     ----
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * ----      Example         ----
 */
public class LeetCode142 {
    public static void main(String[] args) {


    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode fast = head, slow = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            if (fast == slow) {
                ListNode x = head;
                while (x != slow) {
                    x = x.next;
                    slow = slow.next;
                }
                return x;
            }
        }
        return null;

    }
}
