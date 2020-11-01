package leetcode;

import basic.TreeNode;

import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode111 {
    public static void main(String[] args) {

    }

    /**
     * 递归
     *
     * @param root
     * @return
     */
    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(minDepth(root.left), min);
        }
        if (root.right!=null){
            min= Math.min(minDepth(root.right), min);
        }
        return min;
    }

    /**
     * 迭代
     *
     * @param root
     * @return
     */
    public static int minDepth1(TreeNode root) {

        int minDepth = 0;
        if (root == null) {
            return minDepth;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            minDepth++;
            TreeNode pop = stack.pop();
            if (pop.getLeft() != null && pop.getRight() != null) {
                stack.push(pop.getRight());
                stack.push(pop.getLeft());
            } else {
                break;
            }

        }
        return minDepth;
    }
}
