package hashtable.longestConsecutive;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:Solution
 * Package:hashtable.longestConsecutive
 * Description:
 *
 * @date:2024/12/25 21:14
 * @author: Junquan Yi
 */
public class Solution {
    // 128. 最长连续序列，middle
    // https://leetcode.cn/problems/longest-consecutive-sequence
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLen = 1;
        for (int num : nums) {
            int temp = num;
            int count = 1;
            if (set.contains(temp - 1)) {
                continue;
            }
            while (set.contains(temp+1)) {
                count += 1;
                temp = temp + 1;
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int len= solution.longestConsecutive(new int[]{7,2,-2,9,6,9,-7,2,1,-3,-1,-7,-5});
        System.out.println(len);
    }
}
