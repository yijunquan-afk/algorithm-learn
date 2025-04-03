package dp.basic.climbStairs;

/**
 * ClassName:Solution
 * Package:dp.basic.climbStairs
 * Description:
 *
 * @date:2025/1/31 17:40
 * @author: Junquan Yi
 */
public class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] dp = new int[2];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n ; i++){
            int temp = dp[1];
            dp[1] = dp[0] + temp;
            dp[0] = temp;
        }
        return dp[1];
    }
}
