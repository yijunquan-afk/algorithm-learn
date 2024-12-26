package hashtable.fourSumCount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:Solution
 * Package:hashtable.fourSumCount
 * Description:
 *
 * @date:2024/12/23 19:40
 * @author: Junquan Yi
 */
public class Solution {
    // 四数相加， middle
    // 题目: https://leetcode.cn/problems/4sum-ii/
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        //统计两个数组中的元素之和，同时统计出现的次数，放入map
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        //统计剩余的两个元素的和，在map中找是否存在相加为0的情况，同时记录次数
        for (int i : nums3) {
            for (int j : nums4) {
                res += map.getOrDefault(0 - i - j, 0);
            }
        }
        return res;
    }
}
