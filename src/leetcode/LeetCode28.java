package leetcode;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode28 {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }

    public static int strStr(String haystack, String needle) {

        if (haystack == null || needle == null || needle.equals("")) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            boolean x = true;
            if (i + needle.length() > haystack.length()) {
                return -1;
            }
            for (int j = 0; j < needle.length(); j++) {

                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    x = false;
                    break;
                }
            }
            if (x) {
                return i;
            }
        }
        return -1;
    }
}
