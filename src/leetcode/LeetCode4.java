package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Description     ----
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * ----      Example         ----
 * nums1 = [1, 3]
 * nums2 = [2]
 * 则中位数是 2.0
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 则中位数是 (2 + 3)/2 = 2.5
 */
public class LeetCode4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        double v = findMedianSortedArrays(arr1, arr2);
        System.out.println("两个数组的中位数是:" + v);

    }

    /**
     * 奇数:n/2+1
     * 偶数:[n/2+(n/2+1)]/2
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int i1 = 0;
        int i2 = 0;
        int left = -1;
        int right = -1;
        for (int i = 0; i <= size / 2; i++) {
            left = right;
            if (i1 < nums1.length && (i2 >= nums2.length || nums1[i1] < nums2[i2])) {
                right = nums1[i1++];
            } else {
                right = nums2[i2++];
            }
        }
        if ((size & 1) == 0) {
            return (right + left) / 2.0;
        } else {
            return right;
        }
    }
}
