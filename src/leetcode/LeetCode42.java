package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode42 {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int trap = trap(arr);
        System.out.println(trap);
    }

    /**
     * @param height
     * @return
     */
    public static int trap(int[] height) {
        int s1 = 0, max1 = 0, s2 = 0, max2 = 0, sum = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max1) {
                max1 = height[i];
            }
            if (height[height.length - i - 1] > max2) {
                max2 = height[height.length - i - 1];
            }
            sum += height[i];

            s1 += max1;
            s2 += max2;
        }
        return s1 + s2 - max1 * height.length - sum;
    }
}
