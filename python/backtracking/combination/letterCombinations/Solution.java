package backtracking.combination.letterCombinations;

import java.util.*;

/**
 * ClassName:Solution
 * Package:backtracking.combination.letterCombinations
 * Description:
 *
 * @date:2025/1/8 16:56
 * @author: Junquan Yi
 */
public class Solution {
    String[] letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    List<String> result = new ArrayList<String>();
    // 使用StringBuilder更快
    StringBuilder path = new StringBuilder();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtracking(digits);
        return result;
    }

    void backtracking(String digits){
        if(path.length() == digits.length()){
            result.add(String.valueOf(path));
            return;
        }
        String letter = letters[digits.charAt(path.length())-'0'];
        for(int i = 0; i < letter.length(); i++){
            path.append(letter.charAt(i));
            backtracking(digits);
            path.deleteCharAt(path.length()-1);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }

}
