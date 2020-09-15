package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-06-10
 * ----      Title           ----
 * 使用最小花费爬楼梯
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode746 {


    public static void main(String[] args) {
        int[] aar = new int[]{0, 0, 1, 1};
        int costClimbingStairs = minCostClimbingStairs(aar);
        System.out.println(costClimbingStairs);
    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0) {
            return 0;
        }
        int f1 = 0;
        int f2 = 0;
        for (int i = 0; i < cost.length; i++) {
            int z = cost[i] + Math.min(f1, f2);
            f1 = f2;
            f2 = z;
        }
        return Math.min(f1, f2);

    }
}
