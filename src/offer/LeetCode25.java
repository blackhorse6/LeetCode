package offer;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 合并两个排序的链表
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode25 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(), cur = dum;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }
}
