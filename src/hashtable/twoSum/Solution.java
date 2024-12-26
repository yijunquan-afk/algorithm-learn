package hashtable.twoSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * Package:hashtable.twoSum
 * Description:
 *
 * @date:2024/12/23 19:33
 * @author: Junquan Yi
 */
public class Solution {
    // 两数之和。easy
    // https://leetcode.cn/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
