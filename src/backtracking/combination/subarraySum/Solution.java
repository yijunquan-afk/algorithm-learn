package backtracking.combination.subarraySum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:backtracking.combination.subarraySum
 * Description:
 *
 * @date:2025/1/22 22:13
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/subarray-sum-equals-k/
    // 560. 和为 K 的子数组
    ArrayList<Integer> path = new ArrayList<>();
    int res = 0;
    public int subarraySum(int[] nums, int k) {
        Arrays.sort(nums);
        backtracking(nums, k, 0);
        return res;
    }

    void backtracking(int[]nums, int k, int start){
        if(k == 0){
            res++;
            return;
        }
        for(int i = start; i < nums.length && nums[i] <= k ; i++){
            path.add(nums[i]);
            backtracking(nums, k-nums[i], i);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 1};
        System.out.println(solution.subarraySum(nums, 2));
    }

}
