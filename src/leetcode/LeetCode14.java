package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 最长公共前缀
 * ----      Description     ----
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * ----      Example         ----
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 */
public class LeetCode14 {
    public static void main(String[] args) {
        String[] arr = {"a"};
        String s = longestCommonPrefix(arr);
        System.out.println(s);

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].length() <= 0) {
            return "";
        }
        String p = "";
        boolean b = false;

        for (int i = 0; i < strs[0].length(); i++) {
            p = strs[0].substring(0, i + 1);

            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(p)) {
                    b=true;
                    break;
                }
            }
            if (b){
                break;
            }

        }

        return b?p.substring(0, p.length() - 1):p;
    }
}
