package dp.backpack.complete.numSquares;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:dp.backpack.complete.numSquares
 * Description:
 *
 * @date:2025/2/7 16:14
 * @author: Junquan Yi
 */
public class Solution {
    // 279. 完全平方数, 跟零钱兑换一摸一样
    // https://leetcode.cn/problems/perfect-squares/description/
    public int numSquares(int n) {
       int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1 ; i * i < n ; i++){
            for(int j = i * i; j <= n; j++){
               if(dp[j-i*i]!=Integer.MAX_VALUE) {
                   dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
               }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numSquares(12));
    }
}
