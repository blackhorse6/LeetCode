package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Title           ----
 * 两整数之和
 * ----      Description     ----
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 * ----      Example         ----
 * 输入: a = 1, b = 2
 * 输出: 3
 */
public class LeetCode371 {
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        int sum = getSum(a, b);
        assert sum == a + b;
        System.out.println("和为:" + sum);
    }

    /**
     * 异或和与门
     *
     * @param a
     * @param b
     * @return
     */
    public static int getSum(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int x = a ^ b;
        int y = (a & b) << 1;
        return getSum(x,y);
    }
}
