package hashtable.canConstruct;

/**
 * ClassName:Solution
 * Package:hashtable.canConstruct
 * Description:
 *
 * @date:2024/12/23 19:56
 * @author: Junquan Yi
 */
public class Solution {
    // 383. 赎金信， easy
    // https://leetcode.cn/problems/ransom-note/description/
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for (char c : magazine.toCharArray()) {
            map[c - 'a'] += 1;
        }
        for (char c : ransomNote.toCharArray()) {
            if (map[c - 'a'] == 0) {
                return false;
            }
            map[c - 'a']--;
        }
        return true;
    }
}
