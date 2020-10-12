package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode344 {
    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) {
            return;
        }
        int start = 0, end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

    }
}
