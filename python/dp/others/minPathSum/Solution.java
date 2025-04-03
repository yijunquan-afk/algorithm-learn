package dp.others.minPathSum;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:dp.others.minPathSum
 * Description:
 *
 * @date:2025/2/22 18:12
 * @author: Junquan Yi
 */
class Solution {
    // 64. 最小路径和
    // https://leetcode.cn/problems/minimum-path-sum/description/?envType=study-plan-v2&envId=top-100-liked
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        for(int i = 1 ; i < n ; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(int j = 1 ; j < m ; j++){
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < m ; j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(solution.minPathSum(grid));
        Deque<Integer> stack = new LinkedList<>();

    }
}
