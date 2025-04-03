package dp.backpack.onezero.lastStoneWeightII;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:dp.backpack.onezero.lastStoneWeightII
 * Description:
 *
 * @date:2025/2/5 20:47
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/last-stone-weight-ii/
    // 1049. 最后一块石头的重量 II
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int stone : stones){
            sum += stone;
        }
        int target = sum / 2;
        int dp[] = new int[1501]; // 容量为i的背包能装下的最大重量
        Arrays.fill(dp, 0);
        for(int i = 0; i < stones.length ; i++){
            for(int j = target; j >= stones[i]; j--){
                dp[j] = Math.max(dp[j], dp[j-stones[i]] + stones[i]);
            }
        }
        return sum - 2 * dp[target];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] stones = new int[]{2,7,4,1,8,1};
        System.out.println(solution.lastStoneWeightII(stones));
    }
}
