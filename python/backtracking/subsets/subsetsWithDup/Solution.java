package backtracking.subsets.subsetsWithDup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.subsets.subsetsWithDup
 * Description:
 *
 * @date:2025/1/9 17:20
 * @author: Junquan Yi
 */
public class Solution {
    // 90. 子集 II
    // https://leetcode.cn/problems/subsets-ii/description/
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int[] used = new int[nums.length];
        Arrays.sort(nums);//  去重需要排序
        backtracking(nums, 0, used);
        return res;
    }

    void backtracking(int[] nums, int startIndex, int[] used){
        res.add(new ArrayList<>(subset));
        for(int i = startIndex; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1] && used[i - 1] == 0) continue;
            subset.add(nums[i]);
            used[i] = 1;
            backtracking(nums, i + 1, used);
            subset.remove(subset.size() - 1);
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subsetsWithDup(new int[]{1, 2, 2}));
    }
}
