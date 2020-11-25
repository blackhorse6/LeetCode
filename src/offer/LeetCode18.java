package offer;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode18 {
    public static void main(String[] args) {

    }

    public ListNode deleteNode(ListNode head, int val) {

        //构建头结点
        ListNode node = new ListNode();
        node.next = head;

        ListNode pre = node;
        ListNode current = node.next;
        while (current != null) {
            if (current.val == val) {
                pre.next = current.next;
                break;
            }
            pre = current;
            current = current.next;

        }
        return node.next;
    }
}
