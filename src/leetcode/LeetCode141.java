package leetcode;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Title           ----
 * 环形链表
 * ----      Description     ----
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * ----      Example         ----
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 */
public class LeetCode141 {
    public static void main(String[] args) {
        int[] aar = {3, 2, 0, -4, 2};
        ListNode node = ListNode.generateNode(aar);
        boolean cycle = hasCycle(node);
        System.out.println("该链表是否有环:" + cycle);

    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.getNext() == null) {
            return false;
        }
        ListNode p1 = head.getNext();
        ListNode p2 = head.getNext().getNext();
        while (p2 != null) {
            if (p1.getVal() == p2.getVal()) {
                return true;
            }
            p1 = p1.getNext();
            if (p2.getNext()==null){
                return false;
            }
            p2 = p2.getNext().getNext();
        }
        return false;
    }
}
