package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-27
 * ----      Title           ----
 * 买卖股票的最佳时机含手续费
 * ----      Description     ----
 * 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
 * 你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 * 返回获得利润的最大值。
 * ----      Example         ----
 * 输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
 * 输出: 8
 * 解释: 能够达到的最大利润:
 * 在此处买入 prices[0] = 1
 * 在此处卖出 prices[3] = 8
 * 在此处买入 prices[4] = 4
 * 在此处卖出 prices[5] = 9
 * 总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 */
public class LeetCode714 {
    public static void main(String[] args) {
        int[] aar = {1, 3, 2, 8, 4, 9};
        int profit = maxProfit(aar, 2);
        System.out.println("股票最大利润是:" + profit);
    }

    public static int maxProfit(int[] prices, int fee) {

        return 0;
    }


}

