package leetcode;

import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-26
 * ----      Title           ----
 * 二叉树的前序遍历
 * ----      Description     ----
 * 给定一个二叉树，返回它的 前序 遍历。
 * ----      Example         ----
 */
public class LeetCode144 {

    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {


    }

    /**
     * 递归实现
     *
     * @param root
     * @return
     */
    public List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        list.add(root.getValue());
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
        return null;
    }

}
