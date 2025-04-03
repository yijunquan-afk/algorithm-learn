package dp.maxProfit.maxProfit5;

/**
 * ClassName:Solution
 * Package:dp.maxProfit.maxProfit5
 * Description:
 *
 * @date:2025/2/19 16:31
 * @author: Junquan Yi
 */
class Solution {
    public int maxProfit(int[] prices) {
        // 0: 买入，一直持有和买入
        // 1: 卖出，一直不持有（不包含前一天卖出,因为这样的一天是冷静期，状态有区别）
        // 2：不持有，今天卖出
        // 3：冷静期，前一天卖出（一直不持有）
        int n = prices.length;
        int[][] dp = new int[n][4];
        dp[0][0] = -prices[0];
        for(int i = 1 ; i < n ; i++){
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][3]- prices[i], dp[i-1][1] - prices[i]));
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][3]); // 今天不卖
            dp[i][2] = dp[i-1][0] + prices[i];
            dp[i][3] = dp[i-1][2];
        }
        return Math.max(dp[n-1][1], Math.max(dp[n-1][2], dp[n-1][3]));
    }
}
