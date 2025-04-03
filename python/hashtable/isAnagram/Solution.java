package hashtable.isAnagram;

/**
 * ClassName:Solution
 * Package:hashtable.isAnagram
 * Description:
 *
 * @date:2024/12/23 18:05
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/valid-anagram/
    // 有效的字母异位词, easy
    // 哈希数组解决
    public boolean isAnagram(String s, String t) {
        int[] result = new int[26];
        for (char c : s.toCharArray()) {
            result[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            result[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (result[i] != 0) return false;
        }
        return true;
    }
}
