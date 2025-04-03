package dp.sequence.minDistance2;

/**
 * ClassName:Solution
 * Package:dp.sequence.minDistance2
 * Description:
 *
 * @date:2025/2/21 15:36
 * @author: Junquan Yi
 */
public class Solution {
    //72. 编辑距离
    //https://leetcode.cn/problems/edit-distance/description/
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 0 ; i <= n ; i++){
            dp[i][0] = i;
        }
        for(int j = 1 ; j <= m ; j++){
            dp[0][j] = j;
        }
        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <= m ; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];// 不用编辑
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
                }
            }
        }
        return dp[n][m];
    }
}
