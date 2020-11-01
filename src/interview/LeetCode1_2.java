package interview;

import java.util.HashMap;
import java.util.Map;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode1_2 {
    public static void main(String[] args) {

    }

    public static boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap();
        char[] chars = s1.toCharArray();
        for (char aChar : chars) {
            map.merge(aChar, 1, (a, b) -> a + b);
        }
        for (char bChar : s2.toCharArray()) {
            Integer integer = map.get(bChar);
            if (integer == null) {
                return false;
            }
            map.put(bChar, integer - 1);
        }
        for (Integer value : map.values()) {
            if (value!=0){
                return false;
            }
        }
        return true;

    }
}
