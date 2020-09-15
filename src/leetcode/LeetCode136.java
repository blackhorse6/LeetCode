package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Description     ----
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * ----      Example         ----
 * 输入: [2,2,1]
 * 输出: 1
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class LeetCode136 {
    public static void main(String[] args) {
        int[] aar = {4, 1, 2, 1, 2, 5, 5};
        int number = singleNumber(aar);
        System.out.println(number);
    }

    public static int singleNumber(int[] nums) {
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur = cur ^ nums[i];
        }
        return cur;
    }
}
