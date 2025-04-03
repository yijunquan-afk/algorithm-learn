package stackqueue.finalPrices;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:stackqueue.finalPrices
 * Description:
 *
 * @date:2024/12/28 16:14
 * @author: Junquan Yi
 */
public class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>(); // 单调递增栈
        int n = prices.length;
        int[] ans = new int[n];
        for(int i = n - 1; i >= 0 ; i--) { // 这个顺序要注意
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()] ) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? prices[i] : prices[i] - stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
