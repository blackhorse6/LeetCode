package leetcode;

import basic.TreeNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 二叉搜索树节点最小距离
 * ----      Description     ----
 * 给定一个二叉搜索树的根节点 root，返回树中任意两节点的差的最小值。
 * ----      Example         ----
 */
public class LeetCode783 {
    public static void main(String[] args) {

    }

    private static int cur = Integer.MAX_VALUE;
    private static TreeNode preNode = null;

    /**
     * 给出一个节点，输出节点最小差值
     *
     * @param root
     * @return
     */
    public static int minDiffInBST(TreeNode root) {

        dfs(root);
        return cur;

    }

    public static void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (preNode != null) {
            cur = Math.min(node.val - preNode.val, cur);
        }
        preNode = node;
        dfs(node.right);

    }
}
