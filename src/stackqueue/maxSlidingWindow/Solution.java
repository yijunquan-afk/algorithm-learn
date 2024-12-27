package stackqueue.maxSlidingWindow;

import java.util.*;

/**
 * ClassName:Solution
 * Package:stackqueue.maxSlidingWindow
 * Description:
 *
 * @date:2024/12/26 21:22
 * @author: Junquan Yi
 */
public class Solution {
    // 滑动窗口最大值，hard
    // 题目: https://leetcode.cn/problems/sliding-window-maximum/solutions
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 单调队列解法
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(nums[i]);
        }// 驱逐小于nums[i]的队列元素，实现单调递减
        res[0] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(nums[i]);
            if(deque.peekFirst() == nums[i-k]){
                deque.pollFirst();
            }// 移除元素
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }

    // 优先队列
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int[] res = new int[nums.length - k + 1];
//
//        // 大顶推
//        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]!=o2[0]?o2[0]-o1[0]:o2[1]-o1[1];
//            }
//        });
//
//        for (int i = 0; i < k; i++) {
//            priorityQueue.add(new int[]{nums[i], i});
//        }
//        res[0] = priorityQueue.peek()[0];
//        for (int i = k; i < nums.length; i++) {
//            priorityQueue.offer(new int[]{nums[i], i});
//            while (!priorityQueue.isEmpty() && priorityQueue.peek()[1] < i - k) {
//                priorityQueue.poll();
//            }
//            res[i - k + 1] = priorityQueue.peek()[0];
//        }
//        return res;
//    }
// 暴力解法会超时
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int[] res = new int[nums.length - k + 1];
//
//        for (int i = 0; i+k <= nums.length; i++) {
//            int[] temp = new int[k];
//            for(int j = i; j < i +k; j++){
//                temp[j-i] = nums[j];
//            }
//            Arrays.sort(temp);
//            res[i] = temp[temp.length-1];
//        }
//        return res;
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] res = solution.maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(res));
    }
}
