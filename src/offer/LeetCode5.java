package offer;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 替换空格
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode5 {
    public static void main(String[] args) {

    }

    public String replaceSpace(String s) {

        if (s == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                builder.append("%20");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();

    }
}
