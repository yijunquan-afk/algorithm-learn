package dp.sequence.isSubsequence;

/**
 * ClassName:Solution
 * Package:dp.sequence.isSubsequence
 * Description:
 *
 * @date:2025/2/21 10:58
 * @author: Junquan Yi
 */
public class Solution {
    //392. 判断子序列
    //https://leetcode.cn/problems/is-subsequence/description/
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int[][] dp = new int[n+1][m+1];
        int result = 0;
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <=m; j++){
                if(s.charAt(i-1) == t.charAt(j-1) ){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[n][m] == n;
    }

    public boolean isSubsequence2(String s, String t) {
        // 双指针做法
        if(s.length()==0 ) return true;
        if(s.length()!=0 && t.length()==0) return false;
        int pointer1 =0, pointer2 = 0;
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        while(pointer1 < chars1.length && pointer2 < chars2.length){
            if(chars1[pointer1] == chars2[pointer2]){
                pointer1++;
            }
            pointer2++;
        }
        return pointer1 == chars1.length;
    }
}
