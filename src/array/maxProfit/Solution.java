package array.maxProfit;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * ClassName:Solution
 * Package:array.maxProfit
 * Description:
 *
 * @date:2025/1/5 15:08
 * @author: Junquan Yi
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minValue = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            if (minValue >=  prices[i]) {
                minValue = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i]-minValue);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
