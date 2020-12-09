package offer;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 数组中出现次数超过一半的数字
 * ----      Description     ----
 * [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 2
 * ----      Example         ----
 */
public class LeetCode39 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for (int num : nums) {
            if (votes==0){
                x=num;
            }
            votes+=num==x?1:-1;
        }
        return x;
    }
}
