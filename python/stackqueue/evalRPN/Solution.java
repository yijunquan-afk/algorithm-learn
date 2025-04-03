package stackqueue.evalRPN;

import java.util.ArrayDeque;

/**
 * ClassName:Solution
 * Package:stackqueue.evalRPN
 * Description:
 *
 * @date:2024/12/26 20:03
 * @author: Junquan Yi
 */
public class Solution {
    // 逆波兰表达式, middle
    // 题目: https://leetcode.cn/problems/evaluate-reverse-polish-notation/
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> numStack = new ArrayDeque<>();
        for (String token : tokens) {
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                numStack.push(Integer.parseInt(token));
            } else {
                int num1 = numStack.pop();
                int num2 = numStack.pop();
                int temp = 0;
                switch (token) {
                    case "+":
                        temp = num1 + num2;
                        break;
                    case "-":
                        temp = num2 - num1;
                        break;
                    case "*":
                        temp = num1 * num2;
                        break;
                    case "/":
                        temp = num2 / num1;
                        break;

                }
                numStack.push(temp);
            }
        }

        return numStack.pop();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.evalRPN(new String[]{"4","13","5","/","+"}));
    }
}
