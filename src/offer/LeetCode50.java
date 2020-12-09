package offer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 第一个只出现一次的字符
 * ----      Description     ----
 * s = "abaccdeff"
 * 返回 "b"
 * ----      Example         ----
 */
public class LeetCode50 {
    public static void main(String[] args) {

        char aChar = firstUniqChar("leetcode");
        System.out.println(aChar);
    }

    /**
     * TreeSet 有序不重复
     *
     * @param s
     * @return
     */
    public static char firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return ' ';
        }
        char[] chars = s.toCharArray();
        Set result = new LinkedHashSet();
        Set set = new HashSet();
        for (int i = 0; i < chars.length; i++) {
            if (set.contains(chars[i])) {
                result.remove(chars[i]);
            } else {
                boolean add = result.add(chars[i]);
                if (!add) {
                    result.remove(chars[i]);
                    set.add(chars[i]);
                }
            }
        }

        Iterator iterator = result.iterator();
        if (iterator.hasNext()) {
            return (char) iterator.next();
        }
        return ' ';
    }
}

