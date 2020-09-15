package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Description     ----
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * ----      Example         ----
 * 输入: 123  输出: 321
 * 输入: -123 输出: -321
 * 输入: 120  输出: 21
 */
public class LeetCode7 {
    public static void main(String[] args) {
        int i = reverse(-100000009);
//        int i = reverse(-123);
        System.out.println(i);
    }


    /**
     * 如何考虑数字溢出
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {

        long now = 0;
        while (x != 0) {
            now = now * 10 + x % 10;
            x /= 10;
        }
        if (now < Integer.MIN_VALUE || now > Integer.MAX_VALUE) {
            now = 0;
        }
        return ((int) now);

    }
}
