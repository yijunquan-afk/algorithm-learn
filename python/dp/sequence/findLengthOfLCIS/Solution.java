package dp.sequence.findLengthOfLCIS;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:dp.sequence.findLengthOfLCIS
 * Description:
 *
 * @date:2025/2/20 18:19
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/longest-continuous-increasing-subsequence/
    // 674. 最长连续递增序列
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = 0;
        for(int i = 1 ; i < n ; i++){
            if(nums[i-1] < nums[i]){
                dp[i] = dp[i-1] + 1;
            }
            max = Math.max(dp[i], max);
        }
        return max;

    }
}
