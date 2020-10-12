package interview;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 连续数列
 * ----      Description     ----
 * 给定一个整数数组，找出总和最大的连续数列，并返回总和
 * ----      Example         ----
 * 输入： [-2,1,-3,4,-1,2,1,-5,4]
 * 输出： 6
 * 解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class LeetCode16 {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = maxSubArray(arr);
        System.out.println(i);
    }

    /**
     * 动态规划：重复子问题，最优子结构，状态转移方程
     * nums[0] 存最大值
     * nums[i] 存当前值和当前值+前面值的和的最大值
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            System.out.println("nums[i]=" + nums[i] + "nums[i-1]=" + nums[i - 1]);
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            nums[0] = Math.max(nums[0], nums[i]);
            System.out.println("nums[i]=" + nums[i] );

        }
        return nums[0];
    }
}
