package backtracking.permute.permuteUnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.permute.permuteUnique
 * Description:
 *
 * @date:2025/1/9 22:51
 * @author: Junquan Yi
 */
public class Solution {
    // 47. 全排列 II
    // https://leetcode.cn/problems/permutations-ii/description/
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums, used);
        return result;
    }

    void backtracking(int[]nums, boolean[] used) {
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
        }
        for(int i=0; i<nums.length; i++){
            if(!used[i]){
                if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
                path.add(nums[i]);
                used[i] = true;
                backtracking(nums, used);
                path.remove(path.size()-1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permuteUnique(new int[]{1, 1, 2}));;
    }

}
