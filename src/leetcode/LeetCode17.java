package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-09
 * ----      Title           ----
 * 电话号码的字母组合
 * ----      Description     ----
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * ----      Example         ----
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LeetCode17 {
    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return null;
        }
        List<List<Character>> chars = new ArrayList<>();
        char[] charArray = digits.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '2':
                    chars.add(new ArrayList<>(Arrays.asList('a', 'b', 'c')));
                    break;
                case '3':
                    chars.add(new ArrayList<>(Arrays.asList('d', 'e', 'f')));
                    break;
                case '4':
                    chars.add(new ArrayList<>(Arrays.asList('g', 'h', 'i')));
                    break;
                case '5':
                    chars.add(new ArrayList<>(Arrays.asList('j', 'k', 'l')));
                    break;
                case '6':
                    chars.add(new ArrayList<>(Arrays.asList('m', 'n', 'o')));
                    break;
                case '7':
                    chars.add(new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
                    break;
                case '8':
                    chars.add(new ArrayList<>(Arrays.asList('t', 'w', 'u')));
                    break;
                case '9':
                    chars.add(new ArrayList<>(Arrays.asList('x', 'y', 'z')));
                    break;

            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.size(); i++) {
            for (int j=0;j<chars.get(i).size();j++){
//                list.add()
            }

        }
        return list;
    }
}
