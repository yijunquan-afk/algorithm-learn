package dp.backpack.complete.combinationSum4;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:dp.backpack.complete.combinationSum4
 * Description:
 *
 * @date:2025/2/7 15:58
 * @author: Junquan Yi
 */
public class Solution {
    // 377. 组合总和 Ⅳ
    // https://leetcode.cn/problems/combination-sum-iv/description/
    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[target+1];
        dp[0] = 1; // 为了有个基础值
        for(int j = 0 ; j <= target ; j++){
            for(int i = 0 ; i < n ; i++){
               if(j >= nums[i]) dp[j] = dp[j] + dp[j - nums[i]];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3};
        System.out.println(solution.combinationSum4(nums, 4));
    }

}
