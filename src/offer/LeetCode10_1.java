package offer;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 斐波那契数列
 * 取模 1000000007
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode10_1 {
    public static void main(String[] args) {
        int i = 100;
        while (i >= 0) {
            System.out.println("fib=" + fib(i));
            i--;
        }
    }

    /**
     * n可能比较大，使用dp[]缓存会造成额外空间
     * 0 1 1 2 3 5 8 ...
     *
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        int a = 0;
        int b = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            if (temp > 1000000007) {
                temp = temp % 1000000007;
            }
            a = b;
            b = temp;
        }
        return b;
    }
}
