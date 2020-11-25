package offer;

import basic.ListNode;

import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 从尾到头打印链表
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode6 {
    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int[] arr = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            arr[i] = stack.pop().val;
            i++;
        }
        return arr;

    }
}
