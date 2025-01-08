package backtracking.combination.combinationSum3;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.combination.combinationSum3
 * Description:
 *
 * @date:2025/1/8 16:40
 * @author: Junquan Yi
 */
public class Solution {
    // 组合总和3, middle
    // https://leetcode.cn/problems/combination-sum-iii/description/
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, n, 1);
        return result;
    }

    void backtracking(int k, int n, int start){
        if(path.size() == k && n == 0){
            result.add(new ArrayList<>(path));
            return;
        }
        int upper = n < 9 ? n : 9;  // 剪枝
        for(int i = start; i <= upper; i++){
            path.add(i);
            backtracking(k, n - i, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum3(3, 9));
    }

}
