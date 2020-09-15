package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Description     ----
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * ----      Example         ----
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class LeetCode11 {
    public static void main(String[] args) {
        int[] aar = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int max = maxArea(aar);
        System.out.println("最大能容纳水容量是:" + max);

    }

    public static int maxArea(int[] height) {
        int max = 0;
        if (height == null || height.length <= 1) {
            return max;
        }
        int start = 0;
        int end = height.length - 1;
        max = Math.min(height[end], height[start]) * (end - start);
        int current;
        while (start < end) {
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
            current = Math.min(height[end], height[start]) * (end - start);
            if (current > max) {
                max = current;
            }
        }
        return max;

    }

}
