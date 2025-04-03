package dp.backpack.complete.wordBreak;

import java.util.HashSet;
import java.util.List;

/**
 * ClassName:Solution
 * Package:dp.backpack.complete.wordBreak
 * Description:
 *
 * @date:2025/2/22 11:27
 * @author: Junquan Yi
 */
public class Solution {
    // 139. 单词拆分
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet<String> set = new HashSet(wordDict);
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 0 ; j < i ; j++){
                if(dp[j] && set.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
