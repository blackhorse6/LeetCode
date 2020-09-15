package leetcode;

import basic.ArraysUtils;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-28
 * ----      Title           ----
 * 移动零
 * ----      Description     ----
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * ----      Example         ----
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class LeetCode283 {
    public static void main(String[] args) {
        int[] arr = {2,1};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (j!=i){
                    nums[i]=0;
                }
                j++;
            }

        }
        ArraysUtils.printArray(nums);

    }

}
