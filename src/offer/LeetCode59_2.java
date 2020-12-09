package offer;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 滑动窗口的最大值
 * ----      Description     ----
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * ----      Example         ----
 */
public class LeetCode59_2 {
    public static void main(String[] args) {
        int[] arr = {1, -1};
        int[] ints = maxSlidingWindow(arr, 1);
        System.out.println(ints);

    }

    /**
     * @param nums
     * @param k
     * @return
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int current = 0;
        int[] result = new int[nums.length - k + 1];
        //初始化
        for (int i = 0; i < k; i++) {
            current = Math.max(current, nums[i]);
        }
        result[0] = current;
        //逐部迭代
        for (int i = k; i < nums.length; i++) {
            if (result[i - k] == nums[i - k]) {
                int c = nums[i - k + 1];
                for (int j = i - k + 1; j <= i; j++) {
                    c = Math.max(c, nums[j]);
                }
                result[i - k + 1] = c;
            } else {
                result[i - k + 1] = Math.max(result[i - k], nums[i]);
            }
        }
        return result;

    }
}
