package offer;

import basic.TreeNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 二叉树的镜像
 * ----      Description     ----
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像
 * ----      Example         ----
 */
public class LeetCode27 {
    public static void main(String[] args) {

    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;

    }
}
