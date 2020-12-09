package offer;

import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 二叉搜索树的第k大节点
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode54 {
    public static void main(String[] args) {

        TreeNode treeNode = TreeNode.generateTreeNode(new int[]{3, 1, 4, -1, 2});
        int i = kthLargest(treeNode, 1);
        System.out.println("LeetCode54.main-->" + i);

    }

    /**
     * 非递归，逆中序
     *
     * @param root
     * @param k
     * @return
     */
    public static int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return 0;
        }
        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.right;
            }
            if (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                list.add(pop.val);
                current = pop.left;
            }
        }
        if (list.size() >= k) {
            return list.get(k - 1);
        }
        return 0;
    }


}
