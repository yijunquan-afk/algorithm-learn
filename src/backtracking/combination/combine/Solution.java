package backtracking.combination.combine;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.combination.combine
 * Description:
 *
 * @date:2025/1/8 16:04
 * @author: Junquan Yi
 */
public class Solution {
    // 77. 组合，middle
    // https://leetcode.cn/problems/combinations/description/
    // 剪枝：https://programmercarl.com/0077.%E7%BB%84%E5%90%88.html#%E5%89%AA%E6%9E%9D%E4%BC%98%E5%8C%96
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;
    }

    void backtracking(int n, int k, int start) {// 靠start避免重复。
        if(path.size() == k) {
            result.add(new ArrayList<>(path));// 要new一个
            return;
        }
        for(int i = start; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.remove(path.size() - 1); // 回溯
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combine(4, 2));
    }
}
