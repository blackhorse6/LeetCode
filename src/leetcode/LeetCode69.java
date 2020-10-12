package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode69 {
    public static void main(String[] args) {

    }

    public int mySqrt(int x) {

        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }



}
