package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode169 {
    public static void main(String[] args) {

        int[] aar = {3, 3, 4};
        System.out.println(majorityElement(aar));

    }

    public static int majorityElement(int[] nums) {

        int count = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                current = nums[i];
            }
            if (current == nums[i]) {
                count++;
            } else {
                count--;
            }

        }
        return current;
    }
}
