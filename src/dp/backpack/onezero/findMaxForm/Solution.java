package dp.backpack.onezero.findMaxForm;

/**
 * ClassName:Solution
 * Package:dp.backpack.onezero.findMaxForm
 * Description:
 *
 * @date:2025/2/6 20:31
 * @author: Junquan Yi
 */
public class Solution {
    // 474. 一和零
    // https://leetcode.cn/problems/ones-and-zeroes/description/
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1]; // dp[i][j]表示i个0，j个1的最大子集和
        dp[0][0] = 0;
        for(String str : strs){
            int oneNum = 0, zeroNum = 0;
            for(char c : str.toCharArray()){
                if(c == '0') zeroNum++;
                else oneNum++;
            }
            for(int i = m; i >= zeroNum ; i--){
                for(int j = n; j >= oneNum; j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1); // 也就是不需要当前str的dp和需要的dp中的较大值
                }
            }
        }
        return dp[m][n];
    }
}
