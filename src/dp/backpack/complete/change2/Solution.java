package dp.backpack.complete.change2;

/**
 * ClassName:Solution
 * Package:dp.backpack.complete.change2
 * Description:
 *
 * @date:2025/2/7 15:15
 * @author: Junquan Yi
 */
public class Solution {
    // 518. 零钱兑换 II
    // https://leetcode.cn/problems/coin-change-ii/description/
    public int change2(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1]; // dp[i][j]表示用coins中0:i的coin能凑出来j的数目
        for(int i = 0 ; i < n ; i++){
            dp[i][0] = 1;
        }
        for(int j = 0 ; j <= amount ; j++){
            if(j % coins[0] == 0) dp[0][j] = 1; // 能整除
        }
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j <= amount ; j++){
                if(j >= coins[i]) dp[i][j] = dp[i-1][j] + dp[i][j - coins[i]];
                else dp[i][j] = dp[i-1][j];
                // 不用i-1，因为可以无限使用个数
            }
        }
        return dp[n-1][amount];
    }

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[] dp = new int[amount+1]; // dp[j]表示用coins中能凑出来j的最大数目
        dp[0] = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = coins[i] ; j <= amount ; j++){
                dp[j] = dp[j] + dp[j-coins[i]];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] coints = new int[]{1,2,5};
        System.out.println(solution.change(5, coints));
    }
}
