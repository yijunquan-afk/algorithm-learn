package dp.sequence.lengthOfLIS;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:dp.sequence.lengthOfLIS
 * Description:
 *
 * @date:2025/2/20 17:41
 * @author: Junquan Yi
 */
public class Solution {
    // 300. 最长递增子序列
    // https://leetcode.cn/problems/longest-increasing-subsequence/description/
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            int temp = 0;
            for(int j = 0 ; j < i; j++){
                if(nums[j] < nums[i] && dp[j] + 1 > temp){
                    dp[i] = dp[j] + 1;
                    temp = dp[j] + 1;
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,3,6,7,9,4,10,5,6};
        System.out.println(solution.lengthOfLIS(nums));
    }
}
