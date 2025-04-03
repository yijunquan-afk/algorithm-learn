package array.longestsubstring;

import java.util.HashSet;

/**
 * ClassName:Solution
 * Package:array.longestsubstring
 * Description:
 *
 * @date:2024/12/20 22:04
 * @author: Junquan Yi
 */
public class Solution {
    // 题目： 无重复字符的最大子串：https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/
    // 最大滑动窗口
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLen = 0;
        HashSet<Character> charSet = new HashSet<Character>();
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            while(charSet.contains(c)) {
                charSet.remove(s.charAt(start));
                start++;
            }
            charSet.add(c);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
