package dp.maxProfit.maxProfit3;

/**
 * ClassName:Solution
 * Package:dp.maxProfit.maxProfit3
 * Description:
 *
 * @date:2025/2/19 15:28
 * @author: Junquan Yi
 */
public class Solution {
    // 123. 买卖股票的最佳时机 III
    // https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iii/
    public int maxProfit(int[] prices) {
        /**
         * 设置四个状态
         * 第一次持有股票 dp[i][0]
         * 第一次不持有股票 dp[i][1]
         * 第二次持有股票   dp[i][2]
         * 第二次不持有股票  dp[i][3]
         */
        int n = prices.length;
        int[][] dp = new int[n][4];
        dp[0][0] = -prices[0];
        dp[0][2] = -prices[0];
        for(int i = 1 ; i < n; i++){
            dp[i][0] = Math.max(dp[i-1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]+prices[i]);
            dp[i][2] = Math.max(dp[i-1][2], dp[i-1][1]-prices[i]);
            dp[i][3] = Math.max(dp[i-1][3], dp[i-1][2]+prices[i]);
        }
        return dp[n-1][3];
    }
}
