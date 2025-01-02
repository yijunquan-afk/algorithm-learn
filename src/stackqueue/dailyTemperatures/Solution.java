package stackqueue.dailyTemperatures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:stackqueue.dailyTemperatures
 * Description:
 *
 * @date:2024/12/28 16:35
 * @author: Junquan Yi
 */
public class Solution {
    // 739. 每日温度，middle
    // https://leetcode.cn/problems/daily-temperatures/description/
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>(); // 单调递减栈
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return res;
    }
}
