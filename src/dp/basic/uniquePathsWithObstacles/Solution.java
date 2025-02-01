package dp.basic.uniquePathsWithObstacles;

/**
 * ClassName:Solution
 * Package:dp.basic.uniquePathsWithObstacles
 * Description:
 *
 * @date:2025/2/1 19:21
 * @author: Junquan Yi
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m * n == 0 || obstacleGrid[0][0] == 1)
            return 0;// 第一个点就有障碍
        if (m == 1 && n == 1)
            return 1;// 只有一个格子且无障碍
        int[][] dp = new int[m][n];
        for (int i = 1; i < m && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        } // 如果有障碍，后面的都为0

        for (int j = 1; j < n && obstacleGrid[0][j] == 0; j++) {
            dp[0][j] = 1;
        }
        // 由于只能向下和向右，进行限制，初始化
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
