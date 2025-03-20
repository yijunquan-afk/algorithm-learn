package dp.basic.deleteAndEarn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:dp.basic.deleteAndEarn
 * Description:
 *
 * @date:2025/3/17 15:57
 * @author: Junquan Yi
 */
class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int curNum = nums[0];
        int curSum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> numKey = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == curNum){
                curSum += curNum;
            }else{
                arr.add(curSum);
                numKey.add(curNum);
                curNum = nums[i];
                curSum = curNum;
            }
        }
        arr.add(curSum);
        numKey.add(curNum);
        if(arr.size() == 1) return arr.get(0);
        int[] dp = new int[2];
        dp[0] = arr.get(0);
        if(numKey.get(1) == numKey.get(0) + 1){
            dp[1] = Math.max(arr.get(0), arr.get(1));
        }else{
            dp[1] = dp[0] + arr.get(1);
        }

        for(int i = 2 ; i < arr.size(); i++){
            int temp = dp[1];
            if(numKey.get(i) == numKey.get(i-1) + 1){
                dp[1] = Math.max(dp[1], dp[0] + arr.get(i));
            }else{
                dp[1] = Math.max(dp[1], dp[0])+ arr.get(i);
            }
            dp[0] = temp;
        }
        return dp[1];
    }
}