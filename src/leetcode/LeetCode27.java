package leetcode;

import basic.ArraysUtils;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-28
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode27 {
    public static void main(String[] args) {

        int[] arr = {0,1,2,2,3,0,4,2};
        int i = removeElement(arr, 2);
        System.out.println("\n"+i);
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
            } else {
                if (j != i) {
                    nums[j] = nums[i];
                    nums[i]=0;
                }
                j++;
            }
        }
        ArraysUtils.printArray(nums);
        return j;
    }

}
