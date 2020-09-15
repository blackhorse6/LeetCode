package leetcode;

import basic.ArraysUtils;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Title           ----
 * 两数之和
 * ----      Description     ----
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * ----      Example         ----
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class LeetCode1 {
    public static void main(String[] args) {
        int[] aar = {0, 4, 3, 0};
        int[] twoSum = twoSum(aar, 0);
        ArraysUtils.printArray(twoSum);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] newAar = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int x = findIndex(newAar, nums[i]);
            if (x >= 0 && x != i) {
                return new int[]{x, i};
            }
            newAar[i] = target - nums[i];
        }
        return null;
    }

    private static int findIndex(int[] aar, int target) {
        if (aar == null || aar.length == 0) {
            return -1;
        }
        for (int i = 0; i < aar.length; i++) {
            if (aar[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
