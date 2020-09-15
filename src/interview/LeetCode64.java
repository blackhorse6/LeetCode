package interview;

/**
 * User          : zhouchenbin
 * Date          : 2020-06-09
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode64 {
    public static void main(String[] args) {
        int nums = sumNums(5);
        System.out.println(nums);
    }

    public static int sumNums(int n) {
        if (n == 0) {
            return 0;
        }
        n += sumNums(n - 1);
        return n;
    }
}
