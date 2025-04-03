package backtracking.others.findSubsequences;

import java.util.*;

/**
 * ClassName:Solution
 * Package:backtracking.others.findSubsequences
 * Description:
 *
 * @date:2025/1/9 17:51
 * @author: Junquan Yi
 */
public class Solution {
    // 非递减子序列
    // https://leetcode.cn/problems/non-decreasing-subsequences/description/
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subseq = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums, 0);
        return res;
    }

    void backtracking(int[] nums, int startIndex){
        if(subseq.size() >= 2){
            res.add(new ArrayList<>(subseq));
        }
        for(int i = startIndex; i < nums.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = startIndex; j < i && i > startIndex; j++){
                set.add(nums[j]);
            }
            if(i > startIndex  && set.contains(nums[i])){
                continue;
            }// 去重
            if(subseq.size() > 0 && nums[i] < subseq.get(subseq.size()-1)){
                continue;
            }// 得符合递增条件
            subseq.add(nums[i]);
            backtracking(nums, i + 1);
            subseq.remove(subseq.size() - 1);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findSubsequences(new int[]{1,2,3}));
    }
}

