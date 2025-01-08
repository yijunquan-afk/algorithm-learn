package backtracking.combination.combinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.combination.combinationSum2
 * Description:
 *
 * @date:2025/1/8 20:20
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/combination-sum-ii/
    // 40. 组合总和 II
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int[] used = new int[candidates.length];
        backtracking(candidates, target, 0, used);
        return result;
    }

    void backtracking(int[] candidates, int target, int start, int[] used) {
        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < candidates.length && candidates[i] <= target; i++){
            // used[i - 1] == 1，说明同一树枝candidates[i - 1]使用过
            // used[i - 1] == 0，说明同一树层candidates[i - 1]使用过
            // 要对同一树层使用过的元素进行跳过
            if( i > 0 && candidates[i] == candidates[i-1] && used[i-1] == 0){
                continue;
            }
            path.add(candidates[i]);
            used[i] = 1;
            backtracking(candidates, target - candidates[i], i + 1, used);
            path.remove(path.size() - 1);
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
