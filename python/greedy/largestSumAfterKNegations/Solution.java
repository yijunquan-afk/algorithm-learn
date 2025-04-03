package greedy.largestSumAfterKNegations;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:greedy.largestSumAfterKNegations
 * Description:
 *
 * @date:2025/1/23 17:18
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations
    // 1005. K 次取反后最大化的数组和
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] < 0 && k > 0){
                nums[i] = -nums[i];
                k--;
            }
        }
        if(k % 2 == 1){
            Arrays.sort(nums);
            nums[0] = -nums[0];
        }

        for(int num : nums){
            sum += num;
        }
        return  sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-8,3,-5,-3,-5,-2};
        System.out.println(solution.largestSumAfterKNegations(nums, 6));
    }
}
