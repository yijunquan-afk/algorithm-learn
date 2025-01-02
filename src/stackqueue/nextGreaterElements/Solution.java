package stackqueue.nextGreaterElements;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:stackqueue.nextGreaterElements
 * Description:
 *
 * @date:2024/12/30 15:34
 * @author: Junquan Yi
 */
public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = n * 2 - 1; i >=0 ; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            if(i < n){
                ret[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[i % n]);

        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4,3};
        int[] ret = solution.nextGreaterElements(nums);
        System.out.println(Arrays.toString(ret));
    }
}
