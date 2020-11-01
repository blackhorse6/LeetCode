package leetcode;

import basic.TreeNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode110 {
    public static void main(String[] args) {

    }

    /**
     * 1 终止条件
     * 2 返回值
     * 3 本级该做什么
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left)-height(root.right))<=1&& isBalanced(root.left)&&isBalanced(root.right);
    }

    public static int height(TreeNode root) {
        return root == null ? 0 : Math.max(height(root.left), height(root.right)) + 1;
    }
}
