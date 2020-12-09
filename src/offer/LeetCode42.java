package offer;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode42 {
    public static void main(String[] args) {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        if (nums==null ||nums.length==0){
            return 0;
        }
        int max = nums[0], current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (current<=0){
                current=nums[i];
            }else {
                current+=nums[i];
            }
            max=Math.max(max,current);
        }
        return max;
    }
}
