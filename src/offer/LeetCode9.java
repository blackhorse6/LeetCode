package offer;

import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-14
 * ----      Title           ----
 * 用两个栈实现队列
 * ----      Description     ----
 * ----      Example         ----
 */
public class LeetCode9 {
    public static void main(String[] args) {

    }

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stackTemp = new Stack<>();

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if (stack.isEmpty()){
            return 0;
        }
        while (!stack.isEmpty()){
            stackTemp.push(stack.pop());
        }
        int result = stackTemp.pop();
        while (!stackTemp.isEmpty()){
            stack.push(stackTemp.pop());
        }
        return result;
    }
}
