package leetcode;

import java.util.Arrays;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-06
 * ----      Title           ----
 * 最长上升子序列
 * ----      Description     ----
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度
 * <p>
 * ----      Example         ----
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 */
public class LeetCode300 {
    public static void main(String[] args) {

    }

    /**
     * 动态规划解法
     *
     * @param nums
     * @return
     */
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int res = 0;
        Arrays.fill(dp, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;

    }


}
