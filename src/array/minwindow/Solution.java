package array.minwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * Package:array.minwindow
 * Description:
 *
 * @date:2024/12/21 11:33
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/minimum-window-substring/
    // 76, 最小覆盖子串。hard
    public String  minWindow(String s, String t) {
        int minLen = Integer.MAX_VALUE;
        int min_start = 0, min_end = 0;
        int start = 0;
        HashMap<Character, Integer> charMap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> charMap2 = new HashMap<Character, Integer>();
        for (char c : t.toCharArray()) {
            charMap1.put(c, charMap1.getOrDefault(c, 0) + 1);
        }
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (charMap1.containsKey(c)) {
                charMap2.put(c, charMap2.getOrDefault(c, 0) + 1);
            }
            while (overNum(charMap1, charMap2) && start <= end) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1 ;
                    min_start = start;
                    min_end = end;
                }
                if (charMap1.containsKey(s.charAt(start))) {
                    charMap2.put(s.charAt(start), charMap2.getOrDefault(s.charAt(start), 0) - 1);
                }

                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "": s.substring(min_start, min_end + 1);
    }

    private boolean overNum(HashMap<Character, Integer> charMap1, HashMap<Character, Integer> charMap2) {
        for (char c : charMap1.keySet()) {
            if (charMap2.getOrDefault(c, 0) < charMap1.get(c)) {
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));
    }
}
