package array.minsubarray;

/**
 * ClassName:Solution
 * Package:array.minsubarray
 * Description:
 *
 * @date:2024/12/19 15:10
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/minimum-size-subarray-sum/description/
    // 解答: https://programmercarl.com/0209.%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84.html#%E7%AE%97%E6%B3%95%E5%85%AC%E5%BC%80%E8%AF%BE
    public int minSubArrayLen(int target, int[] nums) {
        // 滑动窗口
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
