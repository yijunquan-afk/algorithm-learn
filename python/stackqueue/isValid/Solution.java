package stackqueue.isValid;

import java.util.Stack;

/**
 * ClassName:Solution
 * Package:stackqueue.isValid
 * Description:
 *
 * @date:2024/12/26 19:23
 * @author: Junquan Yi
 */
class Solution {
    // 括号匹配，easy
    // https://leetcode.cn/problems/valid-parentheses/
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else if(c == ')') {
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }else {
                    return false;
                }
            }else if(c == '}') {
                if(!stack.empty() && stack.peek() == '{'){
                    stack.pop();
                }else {
                    return false;
                }
            }else if(c == ']') {
                if(!stack.empty() && stack.peek() == '['){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
