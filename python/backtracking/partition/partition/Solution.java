package backtracking.partition.partition;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.partition.partition
 * Description:
 *
 * @date:2025/1/9 15:38
 * @author: Junquan Yi
 */
public class Solution {
    // 131. 分割回文串，middle
    // https://leetcode.cn/problems/palindrome-partitioning/description/
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtracking(s, 0);
        return res;
    }

    void backtracking(String s, int start){
        if(start >= s.length()){
            res.add(new ArrayList<>(path));
        }
        for(int i = start; i < s.length(); i++){
            String sub = s.substring(start, i + 1);
            if(isPalindrome(sub)){
                path.add(sub);
            }else {
                continue;
            }// 加上回文
            backtracking(s, i + 1);
            path.remove(path.size() - 1);
        }
    }

    boolean isPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partition("aab"));
    }
}
