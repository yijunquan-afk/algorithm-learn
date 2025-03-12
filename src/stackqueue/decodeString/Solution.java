package stackqueue.decodeString;

import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:stackqueue.decodeString
 * Description:
 *
 * @date:2025/3/9 23:28
 * @author: Junquan Yi
 */
class Solution {
    public String decodeString(String s) {
        LinkedList<Integer> numberStack = new LinkedList<>();
        LinkedList<String> stringStack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int multiply = 0;
        for(char c : s.toCharArray()){
            if(c >= '0' && c <= '9'){
                multiply = multiply * 10 + Integer.parseInt(c + "");
            }else if(c == '['){
                numberStack.addLast(multiply);
                stringStack.addLast(sb.toString());
                multiply = 0;
                sb = new StringBuilder();

            }else if(c == ']'){
                StringBuilder resTmp = new StringBuilder();
                int multiplyTmp = numberStack.removeLast();
                for(int i = 0 ; i < multiplyTmp ; i++){
                    resTmp.append(sb);
                }
                sb = new StringBuilder(stringStack.removeLast() + resTmp);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.decodeString("3[a]2[bc]"));
    }
}
