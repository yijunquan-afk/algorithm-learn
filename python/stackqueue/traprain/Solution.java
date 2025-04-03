package stackqueue.traprain;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName:Solution
 * Package:stackqueue.traprain
 * Description:
 *
 * @date:2024/12/30 16:42
 * @author: Junquan Yi
 */
public class Solution {
    // 接雨水，hard
    // https://leetcode.cn/problems/trapping-rain-water/
    public int trap(int[] height) {
        // 找到当前柱子的左右两端高柱子
        Deque<Integer> stack1 = new ArrayDeque<>(); // 单调递增栈
        Deque<Integer> stack2 = new ArrayDeque<>(); // 单调递增栈
        int[]leftHighIndex = new int[height.length];
        int[] rightHighIndex = new int[height.length];
        for (int i = 0; i < height.length; i++) { // 左边最高的柱子
            while (!stack1.isEmpty() && height[stack1.peek()] <= height[i]) {
                stack1.pop();
            }
            leftHighIndex[i] = stack1.isEmpty() ? -1 : stack1.peek();
            stack1.push(i);
        }
        for(int j = height.length - 1; j >= 0; j--) {
            while (!stack2.isEmpty() && height[stack2.peek()] <= height[j]) {
                stack2.pop();
            }
            rightHighIndex[j] = stack2.isEmpty() ? -1 : stack2.peek();
            stack2.push(j);
        }
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            if(leftHighIndex[i] != -1 && rightHighIndex[i] != -1) {
                res += Math.min(height[leftHighIndex[i]], height[rightHighIndex[i]]) * (rightHighIndex[i] - leftHighIndex[i]-1);
                for(int j = leftHighIndex[i]+1; j < rightHighIndex[i]-1; j++) {
                    res -= height[j];
                }
                i = rightHighIndex[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trap(new int[]{4,2,0,3,2,5}));
    }
}
