package leetcode;

import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
     * 非递归前序
     */
    public List<Integer> preOrderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack();
        if (root!=null){
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return list;

    }
}
