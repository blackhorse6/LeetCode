package leetcode;

import basic.ArraysUtils;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Description     ----
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头
 * *
 * ----      Example         ----
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class LeetCode66 {
    public static void main(String[] args) {
        int[] aar = {4, 3, 2, 9};
        int[] plusOne = plusOne(aar);
        ArraysUtils.printArray(plusOne);

    }

    public static int[] plusOne(int[] digits) {
        int plus = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int x = plus + digits[i];
            digits[i] = x % 10;
            plus = x / 10;
        }
        if (plus == 1) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = plus;
            System.arraycopy(digits, 0, newArr, 1, digits.length);
            return newArr;
        }

        return digits;
    }
}
