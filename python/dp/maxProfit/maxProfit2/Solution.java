package dp.maxProfit.maxProfit2;

/**
 * ClassName:Solution
 * Package:dp.maxProfit.maxProfit2
 * Description:
 *
 * @date:2025/2/18 17:28
 * @author: Junquan Yi
 */
class Solution {
    // 122. 买卖股票的最佳时机 II
    // https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/description/
    public int maxProfit(int[] prices) {
        // 使用dp解决，方便跟后面的题对应上
        int n = prices.length;
        int[][] dp = new int[n][2]; // dp[i][0]表示第i天持有股票时的最大现金, dp[i][1]表示第i天不持有股票时的最大现金
        dp[0][0] = -prices[0]; // 需要花prices[0]的价钱，所以是负的
        dp[0][1] = 0;
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] - prices[i]); // 区别在于可以重复买卖
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i]);
        }
        return dp[n-1][1];
    }

    // 贪心算法
    public int maxProfitGreedy(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1] > prices[i]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }
}