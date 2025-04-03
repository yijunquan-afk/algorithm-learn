package dp.backpack.onezero.canPartition;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:dp.backpack.onezero.canPartition
 * Description:
 *
 * @date:2025/2/4 08:50
 * @author: Junquan Yi
 */
public class Solution {
    // 416. 分割等和子集
    // https://leetcode.cn/problems/partition-equal-subset-sum/description/
    // 物品是nums[i]，重量是nums[i]，价值也是nums[i]，背包体积是sum/2。
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % 2 == 1) return false;
        int target = sum / 2;
        int n = nums.length;
        int[] dp = new int[1001];  // 容量（所能装的重量）为j的背包，所背的物品价值最大可以为dp[j]
        Arrays.fill(dp, 0);
        for(int i = 0 ; i < n ; i++){
            for(int j = target ; j >= nums[i]; j--){
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[target] == target;
    }
}
