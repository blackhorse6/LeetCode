package leetcode;

import basic.TreeNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode101 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {

       return check(root,root);

    }

    public boolean check(TreeNode left, TreeNode right) {
        //都为空
        if (left == null && right == null) {
            return true;
        }
        //部分为空
        if (left == null || right == null) {
            return false;
        }
        //都不为空
        return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
    }
}
