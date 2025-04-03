package dp.backpack.onezero.findTargetSumWays;

/**
 * ClassName:Solution
 * Package:dp.backpack.onezero.findTargetSumWays
 * Description:
 *
 * @date:2025/2/6 19:37
 * @author: Junquan Yi
 */
public class Solution {
    // 494. 目标和
    // https://leetcode.cn/problems/target-sum/description/
    public int findTargetSumWays1(int[] nums, int target) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int x = (sum - target) / 2;
        if((sum - target) % 2 != 0 || x < 0) return 0;
        int n = nums.length;
        int[][] dp = new int[n + 1][x + 1]; // dp[i][j]表示用0:i的物品塞满大小为j的背包的方式数
        dp[0][0] = 1;
        for(int j = 1; j <= x; j++){
            dp[0][j] = 0;
        }
        for(int i = 1 ; i <= n; i++){
            int num = nums[i-1];
            for(int j = 0 ; j <= x ; j++){
                if(j < num){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-num]; // 不放i和放i
                }
            }
        }
        return dp[n][x];
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int x = (sum - target) / 2;
        if((sum - target) % 2 != 0 || x < 0) return 0;
        int n = nums.length;
        int[] dp = new int[x + 1]; // dp[j]表示用物品塞满大小为j的背包的方式数
        dp[0] = 1;
        for(int i = 1 ; i <= n; i++){
            int num = nums[i-1];
            for(int j = x ; j >= num ; j--){
                dp[j] = dp[j] + dp[j-num]; // 不放i和放i
            }
        }
        return dp[x];
    }
}