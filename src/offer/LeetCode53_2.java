package offer;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 0～n-1中缺失的数字
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode53_2 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
    }

    /**
     * 二分查找到第一个和下标不一致元素
     *
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start<end){
            int mid = (start+end)/2;
            if (nums[mid]==mid) {
                start= mid+1;
            }else {
                end=mid-1;
            }

        }
        return start;
    }
}
