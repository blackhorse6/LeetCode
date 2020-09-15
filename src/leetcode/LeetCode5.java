package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-09
 * ----      Title           ----
 * 最长回文子串
 * ----      Description     ----
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * ----      Example         ----
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 */
public class LeetCode5 {
    public static void main(String[] args) {

    }

    /**
     * 中心扩散法
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return "";
        }
        char[] chars = s.toCharArray();
        int maxStart = 0;
        int maxEnd = 0;
        int curStart = 0;
        int curEnd = 0;
        for (int i = 0; i < chars.length; i++) {


        }
        return "";
    }
}
