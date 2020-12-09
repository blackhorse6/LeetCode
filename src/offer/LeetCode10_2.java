package offer;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 青蛙跳台阶问题
 * 取模 1000000007
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode10_2 {
    public static void main(String[] args) {

        int i = 100;
        while (i >= 0) {
            System.out.println("numWays==>" + numWays(i));
            i--;

        }

    }

    /**
     * 非递归
     * 0 1 2 3
     *
     * @param n
     * @return
     */
    public static int numWays(int n) {
        if (n < 0) {
            return n;
        }
        if (n<2){
            return 1;
        }
        int a = 1;
        int b = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }
        return b;

    }
}
