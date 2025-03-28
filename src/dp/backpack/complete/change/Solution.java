package dp.backpack.complete.change;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:dp.backpack.complete.chang
 * Description:
 *
 * @date:2025/2/7 15:40
 * @author: Junquan Yi
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        for(int i = 0 ; i < n ; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = coins[i]; j <= amount; j++){
                if(dp[j-coins[i]] == Integer.MAX_VALUE) continue;
                dp[j] = Math.min(dp[j], dp[j-coins[i]] + 1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] coins = new int[]{1,2,5};
        System.out.println(solution.coinChange(coins, 11));
        String[] test = new String[]{"2", "10", "100"};
        Arrays.sort(test);
        System.out.println(test[0] + " " + test[1] + " " + test[2]);
    }
}
