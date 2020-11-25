package offer;

import basic.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode32 {
    public static void main(String[] args) {

    }

    public int[] levelOrder(TreeNode root) {

        if (root == null) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            list.add(poll.val);
            if (poll.left != null) {
                queue.add(poll.left);
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }
        }

        int[] aar = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            aar[i] = list.get(i);
        }

        return aar;

    }
}
