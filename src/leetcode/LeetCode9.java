package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-28
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode9 {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(10_000);
        boolean b = isPalindrome(x);
        System.out.println("x=" + x + "-->" + b);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        Stack stack = new Stack();
        Queue queue = new ArrayDeque();
        int t = x;
        while (t > 0) {
            stack.push(t % 10);
            queue.add(t % 10);
            t = t / 10;
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }
        return true;
    }
}
