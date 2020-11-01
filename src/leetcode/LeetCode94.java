package leetcode;

import basic.ListNode;
import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 二叉树的中序遍历
 * ----      Description     ----
 * 给定一个二叉树，返回它的中序 遍历。
 * ----      Example         ----
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [1,3,2]
 */
public class LeetCode94 {
    public static void main(String[] args) {

    }

    /**
     * 1 递归
     *
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;

    }

    private static void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeft(), list);
        list.add(root.getValue());
        inOrder(root.getRight(), list);
    }


    /**
     * 2 栈
     *
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()){
                TreeNode pop = stack.pop();
                list.add(pop.value);
                stack.push(pop.right);
            }

        }

        return list;

    }

    /**
     * 2 迭代
     *
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal3(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;

    }


}
