package dp.basic.integerBreak;

/**
 * ClassName:Solution
 * Package:dp.basic.integerBreak
 * Description:
 *
 * @date:2025/2/2 11:45
 * @author: Junquan Yi
 */
public class Solution {
    // 343. 整数拆分
    // https://leetcode.cn/problems/integer-break/description/
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for(int i = 3 ; i <=n ; i++ ){
            for (int j = 1 ; j <= i /2 ; j++){
                dp[i] = Math.max((i-j) * j, dp[i-j] * j);
            }
        }
        return dp[n];
    }
}
