package leetcode;

import basic.ListNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Title           ----
 * 两数相加
 * ----      Description     ----
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * ----      Example         ----
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class LeetCode2 {
    public static void main(String[] args) {
        ListNode node1 = ListNode.generateNode(new int[]{2, 4, 3});
        ListNode node2 = ListNode.generateNode(new int[]{5, 6});

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int plus = 0;
        int cur;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode root = null;
        ListNode curNode = null;
        while (p1 != null && p2 != null) {
            int currentAll = p1.getVal() + p2.getVal() + plus;
            cur = currentAll % 10;
            if (root == null) {
                root = curNode = new ListNode(cur);
            } else {
                curNode.setNext(new ListNode(cur));
                curNode = curNode.getNext();
            }

            plus = currentAll / 10;
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        if (p1 != null && curNode != null) {
            curNode.setNext(new ListNode(curNode.getVal() + plus));
        }
        if (p2 != null && curNode != null) {
            curNode.setNext(new ListNode(curNode.getVal() + plus));
        }
        return root;
    }


}
