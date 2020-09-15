package leetcode;

import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-09
 * ----      Title           ----
 * 有效的括号
 * ----      Description     ----
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * ----      Example         ----
 * 输入: "()[]{}"
 * 输出: true
 */
public class LeetCode20 {
    public static void main(String[] args) {

        System.out.println(isValid(")"));

    }

    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(')');
            } else if (chars[i] == '{') {
                stack.push('}');
            } else if (chars[i] == ']') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != chars[i]) {
                return false;
            }
        }

        return stack.isEmpty();
    }


}
