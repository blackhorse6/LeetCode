package leetcode;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 两两交换链表中的节点
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode24 {
    public static void main(String[] args) {

    }

    /**
     * 1 终止条件
     * 2 返回值
     * 3 当前级应该做什么？
     * A B C
     *
     * @param a
     * @return
     */
    public ListNode swapPairs(ListNode a) {

        if (a == null || a.next == null) {
            return a;
        }
        ListNode b = a.next;
        a.next = swapPairs(a.next.next);
        b.next = a;
        return b;

    }

}
