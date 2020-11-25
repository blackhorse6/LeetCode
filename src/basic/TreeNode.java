package basic;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Title           ----
 * 基础数结构
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }


    public static TreeNode generateTreeNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        return null;
    }
}
