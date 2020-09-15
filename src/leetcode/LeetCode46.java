package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-06-09
 * ----      Title           ----
 * 把数字翻译成字符串
 * ----      Description     ----
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * ----      Example         ----
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 */
public class LeetCode46 {
    public static void main(String[] args) {
        int translateNum = translateNum(12258);
        System.out.println(translateNum);
    }

    /** 递归
     * 1位数 1
     * 2位数&&[10,25] 2
     *
     */
    public static int translateNum(int num) {
        if (num < 10) {
            return 1;
        }
        int x = num % 100;
        if (x <10 || x > 25) {
            return translateNum(num / 10);
        }
        return translateNum(num / 10) + translateNum(num / 100);

    }
}
