package backtracking.subsets.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.subsets.subsets
 * Description:
 *
 * @date:2025/1/9 17:01
 * @author: Junquan Yi
 */
public class Solution {
    // 78. 子集
    // https://leetcode.cn/problems/subsets/description/
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        return res;
    }

    void backtracking(int[] nums, int startIndex){
        res.add(new ArrayList<>(subset));
        for(int i = startIndex; i < nums.length; i++){
            subset.add(nums[i]);
            backtracking(nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subsets(new int[]{1, 2, 3}));
    }
}
