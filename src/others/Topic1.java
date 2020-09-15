package others;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-25
 * ----      Title           ----
 * 背包问题
 * ----      Description     ----
 * <p>
 * ----      Example         ----
 */
public class Topic1 {
    public static void main(String[] args) {
        int[] weight = {1, 2, 5, 6, 7};
        int[] price = {1, 6, 18, 22, 28};
        finMax(price, weight, 11);

    }

    private static int finMax(int[] price, int[] weight, int maxWeight) {
        //构建一个二维数组
        int[][] arr = new int[weight.length][maxWeight];
        for (int j = 0; j < weight.length; j++) {
            for (int i = 1; i <= maxWeight; i++) {
                if (weight[j] <= i) {
                    arr[j][i - 1] = 1;
                } else {
                    arr[j][i - 1] = 0;
                }
            }
        }
        //查找对角线
        int max = 0;
        for (int j = 0; j < weight.length; j++) {
            for (int i = 0; i < maxWeight; i++) {

            }
        }

        return max;
    }
}
