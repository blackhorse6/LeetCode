package offer;

import basic.ListNode;

import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 两个链表的第一个公共节点
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode52 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Stack<ListNode> stackA = new Stack();
        Stack<ListNode> stackB = new Stack();
        while (headA != null) {
            stackA.push(headA);
            headA = headA.next;
        }
        while (headB != null) {
            stackB.push(headB);
            headB = headB.next;
        }
        ListNode curA = null;
        ListNode curB = null;
        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            curA = stackA.pop();
            curB = stackB.pop();
            if (curA.val == curB.val) {
                return curA;
            }

        }
        return null;


    }
}
