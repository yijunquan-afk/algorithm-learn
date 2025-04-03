package dp.maxProfit.maxProfit4;

/**
 * ClassName:Solution
 * Package:dp.maxProfit.maxProfit4
 * Description:
 *
 * @date:2025/2/19 16:24
 * @author: Junquan Yi
 */
class Solution {
    // 188. 买卖股票的最佳时机 IV
    // https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iv/
    public int maxProfit(int k, int[] prices) {
        int n = prices.length, m = 2 * k + 1;
        int[][] dp = new int[n][m]; // 奇数持有，偶数卖出
        dp[0][0] = 0;
        for(int i = 1 ; i < m ; i+=2){
            dp[0][i] = -prices[0]; // 初始持有得是-prices[0]
        }
        for(int i = 1 ; i < n ; i++){
            for(int j = 1; j < m; j+=2){
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]-prices[i]);
                dp[i][j+1] = Math.max(dp[i-1][j+1], dp[i-1][j]+prices[i]);
            }
        }
        return dp[n-1][m-1];
    }
}
