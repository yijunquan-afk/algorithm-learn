package backtracking.permute.permute;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.permute.permute
 * Description:
 *
 * @date:2025/1/9 22:39
 * @author: Junquan Yi
 */
public class Solution {
    // 46. 全排列
    // https://leetcode.cn/problems/permutations/description/
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtracking(nums, used);
        return result;
    }

    void backtracking(int[]nums, boolean[] used) {
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
        }
        for(int i=0; i<nums.length; i++){
            if(!used[i]){
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
        System.out.println(solution.permute(new int[]{1, 2, 3}));;
    }
}
