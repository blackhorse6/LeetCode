package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-25
 * ----      Title           ----
 * 无重复字符的最长子串
 * ----      Description     ----
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * ----      Example         ----
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class LeetCode3 {
    public static void main(String[] args) {
        String s = "auua";
        int length = lengthOfLongestSubstring(s);
        System.out.println("长度是:" + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        //最大值
        int max = 0;
        //当前指针
        int cur = -1;
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            Integer index = map.get(chars[i]);
            if (index != null) {
                if (index > cur) {
                    cur = index;
                }
            }
            max = Math.max(max, i - cur);
            map.put(chars[i], i);
        }
        return max;
    }
}
