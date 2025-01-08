package backtracking.combination.combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.combination.combinationSum
 * Description:
 *
 * @date:2025/1/8 19:48
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/combination-sum/
    // 39. 组合总和
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates, target, 0);
        return result;
    }

    void backtracking(int[] candidates, int target, int start){
        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < candidates.length && candidates[i] <= target; i++){
            path.add(candidates[i]);
            backtracking(candidates, target - candidates[i], i);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum(new int[]{2,3,5}, 8));
    }
}
