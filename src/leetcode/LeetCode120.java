package leetcode;

import java.util.List;

/**
 * User          : zhouchenbin
 * Date          : 2020-06-09
 * ----      Title           ----
 * 三角形最小路径和
 * ----      Description     ----
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * ----      Example         ----
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 */
public class LeetCode120 {
    public static void main(String[] args) {

    }

    /**
     * 自底向上动态规划
     *
     * @param triangle
     * @return
     */
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> sub = triangle.get(i);
            for (int j = 0; j < sub.size(); j++) {
                int x = sub.get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                sub.set(j, x);
            }
        }
        return triangle.get(0).get(0);
    }
}
