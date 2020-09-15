package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Title           ----
 * 爬楼梯
 * ----      Description     ----
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * ----      Example         ----
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 */
public class LeetCode70 {
    public static void main(String[] args) {
        int i = climbStairs(45);
        int i2 = climbStairs2(45);
        assert i == i2;
        System.out.println("爬楼梯的方法有:" + i);
    }

    /**
     * 使用递归超时
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * @param n
     * @return
     */
    public static int climbStairs2(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }
}
