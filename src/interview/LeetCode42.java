package interview;

import basic.ArraysUtils;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-27
 * ----      Title           ----
 * 连续子数组的最大和
 * ----      Description     ----
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。
 * ----      Example         ----
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class LeetCode42 {

    public static void main(String[] args) {
        int[] aar = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = maxSubArray(aar);
        System.out.println("最大和是:" + max);

    }

    /**
     * 动态规划
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //改变数组值,0 表示舍弃
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        ArraysUtils.printArray(nums);
        return res;

    }
}
