package leetcode;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 删除排序链表中的重复元素
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode83 {
    public static void main(String[] args) {

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if (slow.val == fast.val) {
                fast = fast.next;
            } else {
                slow = fast;
            }
        }
        return null;
    }
}
