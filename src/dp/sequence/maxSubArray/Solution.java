package dp.sequence.maxSubArray;

/**
 * ClassName:Solution
 * Package:dp.sequence.maxSubArray
 * Description:
 *
 * @date:2025/2/21 10:06
 * @author: Junquan Yi
 */
public class Solution {
    // [53. 最大子数组和](https://leetcode.cn/problems/maximum-subarray/)

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0]; // dp[i]表示以nums[i]结尾的连续子数组的最大和
        int max = dp[0];
        for(int i = 1 ; i < n ; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            if(dp[i] > max) max = dp[i];
        }
        return max;
    }

    // 贪心做法
    public int maxSubArray2(int[] nums) {
        int temp = 0 , sum = nums[0];
        for(int i = 0;i< nums.length;i++){
            if(temp > 0){
                temp += nums[i];
            }else{
                temp = nums[i];
            }
            if(temp > sum){
                sum = temp;
            }
        }
        return sum;
    }
}
