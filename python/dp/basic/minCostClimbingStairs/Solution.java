package dp.basic.minCostClimbingStairs;

/**
 * ClassName:Solution
 * Package:dp.basic.minCostClimbingStairs
 * Description:
 *
 * @date:2025/1/31 17:48
 * @author: Junquan Yi
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1]; // 表示到第i个台阶所需的费用
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= cost.length; i++){
            int minCost = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
            dp[i] = minCost;
        }
        return dp[n];
    }
}
