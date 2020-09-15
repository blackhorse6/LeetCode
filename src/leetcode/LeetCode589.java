package leetcode;

import basic.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-26
 * ----      Title           ----
 * N叉树的前序遍历
 * ----      Description     ----
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 * ----      Example         ----
 */
public class LeetCode589 {
    public static List<Integer> list = new ArrayList<>();
    public static Stack<Node> stack = new Stack<>();

    public static void main(String[] args) {
        Node mockData = Node.mockData();
        preOrder1(mockData);
        printList(list);
        List<Integer> list2 = preOrder2(mockData);
        System.out.println("\npreOrder2 output ");
        printList(list2);
    }

    /**
     * 递归 01
     *
     * @param root
     * @return
     */
    public static List<Integer> preOrder1(Node root) {
        if (root == null) {
            return null;
        }
        list.add(root.value);
        if (!isEmpty(root.children)) {
            for (Node n : root.children) {
                preOrder1(n);
            }
        }
        return list;
    }

    /**
     * 栈
     *
     * @param root
     * @return
     */
    public static List<Integer> preOrder2(Node root) {
        List<Integer> list = new ArrayList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.value);
            if (node.children != null && !node.children.isEmpty()) {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    stack.push(node.children.get(i));
                }
            }
        }
        return list;
    }

    public static boolean isEmpty(List list) {
        return list == null || list.isEmpty();
    }

    public static void printList(List<Integer> list) {
        if (isEmpty(list)) {
            return;
        }
        for (Integer i : list) {
            System.out.print(i);
        }
    }
}
