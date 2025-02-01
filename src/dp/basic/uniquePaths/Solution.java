package dp.basic.uniquePaths;

/**
 * ClassName:Solution
 * Package:dp.basic.uniquePaths
 * Description:
 *
 * @date:2025/2/1 19:09
 * @author: Junquan Yi
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n]; // 表示i行j列上到达的路径
        for(int i = 0 ; i < m; i++){
            dp[i][0] = 1; // 第一列只有一个路径
        }
        for(int j = 0 ; j < n ; j++){
            dp[0][j] = 1; // 第一行只有一个路径
        }
        for(int i = 1 ; i < m; i++){
            for(int j = 1 ; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
