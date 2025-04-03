package dp.rob.rob2;

/**
 * ClassName:Solution
 * Package:dp.rob.rob2
 * Description:
 *
 * @date:2025/2/17 20:51
 * @author: Junquan Yi
 */
class Solution {
    // 213. 打家劫舍 II
    // https://leetcode.cn/problems/house-robber-ii/description/
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int removeHead = robHelp(nums, 1, n); // 去掉最开始的房间
        int removeTail = robHelp(nums, 0, n - 1); // 去掉最后一个房间
        return Math.max(removeTail, removeHead);
    }

    public int robHelp(int[] nums, int start, int end) {
        int n = end - start;
        if(n == 1) return nums[start];
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(dp[0], nums[start + 1]);
        for(int i  = 2; i < n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i + start]);
        }
        return dp[n-1];
    }
}

