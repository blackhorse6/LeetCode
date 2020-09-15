package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-28
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode35 {
    public static void main(String[] args) {

        int[] aar = {1, 3, 5, 6};
        int i = searchInsert(aar, 3);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int half = 0;
        while (start < end) {
            half = (start + end) / 2;
            if (nums[half] == target) {
                return half ;
            }
            if (nums[half / 2] > target) {
                end = half / 2;
            } else {
                start = half / 2;
            }
        }
        return half + 1;
    }
}
