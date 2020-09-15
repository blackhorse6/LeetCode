package leetcode;

import basic.ArraysUtils;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-26
 * ----      Title           ----
 * 删除排序数组中的重复项
 * ----      Description     ----
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * ----      Example         ----
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class LeetCode26 {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int size = removeDuplicates(arr);
        ArraysUtils.printArray(arr);
        System.out.println("新数组长度为:" + size);

    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (slow == i || nums[i] == nums[slow]) {
                continue;
            } else {
                slow++;
                nums[slow] = nums[i];
            }
        }
        return slow + 1;
    }

}
