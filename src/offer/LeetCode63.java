package offer;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 股票的最大利润
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode63 {
    public static void main(String[] args) {

        int maxProfit = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(maxProfit);
    }

    /**
     * 记住最小值
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            if (prices[i] - min > max) {
                max = Math.max(max, prices[i] - min);
            }

        }
        return max;

    }
}
