package stackqueue.nextGreaterElement;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:stackqueue.nextGreaterElement
 * Description:
 *
 * @date:2024/12/30 15:21
 * @author: Junquan Yi
 */
public class Solution {
    // 496. 下一个更大元素1,easy
    // https://leetcode.cn/problems/next-greater-element-i/description/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] numMap = new int[10002];
        Deque<Integer> stack = new LinkedList<>();//单调递减栈
        for(int i = nums2.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            numMap[nums2[i]] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for(int j = 0; j < nums1.length; j++) {
            res[j] = numMap[nums1[j]];
        }
        return res;
    }
}
