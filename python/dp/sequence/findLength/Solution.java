package dp.sequence.findLength;

/**
 * ClassName:Solution
 * Package:dp.sequence.findLength
 * Description:
 *
 * @date:2025/2/20 18:45
 * @author: Junquan Yi
 */
public class Solution {
    // 718. 最长重复子数组
    // https://leetcode.cn/problems/maximum-length-of-repeated-subarray/description/
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[][] dp = new int[n+1][m+1];
        int result = 0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
        return result;
    }
}
