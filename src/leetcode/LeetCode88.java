package leetcode;

import basic.ArraysUtils;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Description     ----
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * ----      Example         ----
 * 输入:
 * nums1 = [1,2,3], m = 3
 * nums2 = [2,5,6],       n = 3
 * 输出: [1,2,2,3,5,6]
 */
public class LeetCode88 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {1,2,5};
        merge(arr1, 3, arr2, 3);
        ArraysUtils.printArray(arr1);

    }

    /**
     * 注意 num1.length
     *
     * @param nums1
     * @param nums2
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }


    }
}
