package stackqueue.longestSubarray;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:stackqueue.longestSubarray
 * Description:
 *
 * @date:2024/12/27 21:01
 * @author: Junquan Yi
 */
public class Solution {
    // 1438. 绝对差不超过限制的最长连续子数组， middle
    // https://leetcode.cn/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/description/
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> dequeMin = new LinkedList<>();// 单调递增队列，队首最小
        Deque<Integer> dequeMax = new LinkedList<>();// 单调递减队列，队首最大
        int maxLen = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            while (!dequeMax.isEmpty() && dequeMax.peekLast() < nums[j]) {
                dequeMax.pollLast();
            }
            while (!dequeMin.isEmpty() && dequeMin.peekLast() > nums[j]) {
                dequeMin.pollLast();
            }
            dequeMax.offerLast(nums[j]);
            dequeMin.offerLast(nums[j]);
            while(dequeMax.peekFirst() - dequeMin.peekFirst() > limit) {
                if(dequeMax.peekFirst()==nums[i]){
                    dequeMax.pollFirst();
                }
                if(dequeMin.peekFirst()==nums[i]){
                    dequeMin.pollFirst();
                }
                i++;
            }
            int len = j - i + 1;
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestSubarray(new int[]{8,2,4,7}, 4));
    }
}
