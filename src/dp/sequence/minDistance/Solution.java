package dp.sequence.minDistance;

/**
 * ClassName:Solution
 * Package:dp.sequence.minDistance
 * Description:
 *
 * @date:2025/2/21 15:21
 * @author: Junquan Yi
 */
class Solution {
    // 583. 两个字符串的删除操作
    // https://leetcode.cn/problems/delete-operation-for-two-strings/description/
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <= m ; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return n + m - 2*dp[n][m];
    }
}
