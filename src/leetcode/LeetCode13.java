package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-30
 * ----      Title           ----
 * 罗马数字转整数
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode13 {
    public static void main(String[] args) {
        int i = romanToInt("MCMXCIV");
        System.out.println(i);

    }

    public static int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int a = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                a += map.get(s.substring(i, i + 2));
                i++;
            } else {
                a += map.get(s.substring(i, i + 1));
            }
        }
        return a;
    }
}
