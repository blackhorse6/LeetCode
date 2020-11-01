package interview;

import java.util.HashSet;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 判定字符是否唯一
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode1 {
    public static void main(String[] args) {

    }

    public boolean isUnique(String astr) {
        HashSet set = new HashSet();
        char[] chars = astr.toCharArray();
        for (int i=0;i<chars.length;i++){
            boolean add = set.add(chars[i]);
            if (!add){
                return false;
            }
        }
        return true;

    }
}
