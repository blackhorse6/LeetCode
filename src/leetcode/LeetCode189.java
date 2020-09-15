package leetcode;

import basic.ArraysUtils;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Title           ----
 * 旋转数组
 * ----      Description     ----
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * ----      Example         ----
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class LeetCode189 {
    public static void main(String[] args) {
        int[] aar = {1, 2, 3, 4, 5, 6, 7};
        rotate(aar, 3);
        ArraysUtils.printArray(aar);
    }

    public static void rotate(int[] nums, int k) {
        int step = k % nums.length;
        int[] temp = new int[step];
        System.arraycopy(nums, nums.length - step, temp, 0, step);
        System.arraycopy(nums, 0, nums, step, nums.length - step);
        System.arraycopy(temp, 0, nums, 0, step);
    }
}
