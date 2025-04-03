package stackqueue.removeDuplicates;

import java.util.Stack;

/**
 * ClassName:Solution
 * Package:stackqueue.removeDuplicates
 * Description:
 *
 * @date:2024/12/26 19:39
 * @author: Junquan Yi
 */
public class Solution {
    // 1047. 删除字符串中的所有相邻重复项，easy
    // https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string/description/
//    public String removeDuplicates(String s) {
//        Stack<Character> stack = new Stack<>();
//        for(char c : s.toCharArray()) {
//            if(stack.isEmpty() || c != stack.peek()) {
//                stack.push(c);
//            }else {
//                stack.pop();
//            }
//        }
//        char[] res = new char[stack.size()];
//        for(int i = res.length - 1 ; i >= 0 ; i--) {
//            res[i] = stack.pop();
//        }
//        String resStr = "";
//        for(char c : res) {
//            resStr += c;
//        }
//        return resStr;
//    }

    // 字符串解法
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(sb.length() == 0 || c != sb.charAt(sb.length() - 1)) {
                sb.append(c);
            }else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    // 双指针法
//    public String removeDuplicates(String s) {
//        char[] chars = s.toCharArray();
//        int slow = 0;
//        int fast = 0;
//        while (fast<s.length()){
//            chars[slow] = chars[fast];
//            if(slow>0&&chars[slow]==chars[slow-1]){
//                slow--;
//            }else {
//                slow++;
//            }
//            fast++;
//        }
//        return String.valueOf(chars,0,slow);
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates("aabacc"));
    }
}
