package dp.sequence.numDistinct;

/**
 * ClassName:Solution
 * Package:dp.sequence.numDistinct
 * Description:
 *
 * @date:2025/2/21 11:27
 * @author: Junquan Yi
 */
public class Solution {
    public int numDistinct(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int n = chars1.length, m = chars2.length;
        int[][] dp = new int[n+1][m+1]; // 以s[i]结尾和t[j]结尾的最大个数
        for(int i = 0 ; i <=n ; i++){
            dp[i][0] = 1;
        }
        for(int j = 0 ; j <= m ; j++){
            dp[0][j] = 0;
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(chars1[i-1] == chars2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numDistinct("rabbbit", "rabbit"));
    }
}
