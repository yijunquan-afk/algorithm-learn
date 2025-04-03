package hashtable.intersection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * ClassName:Solution
 * Package:hashtable.intersection
 * Description:
 *
 * @date:2024/12/23 18:12
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/intersection-of-two-arrays/description/
    // 349. 两个数组的交集, easy
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            map[nums1[i]] += 1;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map[nums2[i]] > 0) {
                set.add(nums2[i]);
            }
        }
        return set.stream().mapToInt(i -> i).toArray();
    }
}
