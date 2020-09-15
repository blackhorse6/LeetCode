package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-06-10
 * ----      Title           ----
 * 判断子序列
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode392 {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int i = 0, j = 0;
        while (i < sChar.length && j < tChar.length) {
            if (sChar[i] == tChar[j]) {
                i++;
            }
            j++;
        }
        return i == sChar.length ;
    }
}
