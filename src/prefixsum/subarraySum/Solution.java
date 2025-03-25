package prefixsum.subarraySum;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * Package:prefixsum.subarraySum
 * Description:
 *
 * @date:2025/3/22 16:59
 * @author: Junquan Yi
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefixSum = new int[n+1];
        prefixSum[0] = 0;
        for(int i = 1 ; i <= n ; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int pre : prefixSum){
            res += map.getOrDefault(pre - k, 0);
            map.put(pre, map.getOrDefault(pre, 0)+1);
        }
//
//        for(int i = 0 ; i < n ; i++){
//            for(int j = i ; j < n ; j++){
//                if(prefixSum[j + 1] - prefixSum[i] == k){
//                    res++;
//                }
//            }
//        }
        return res;
    }
}
