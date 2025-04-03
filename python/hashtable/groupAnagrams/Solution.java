package hashtable.groupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:Solution
 * Package:hashtable.groupAnagrams
 * Description:
 *
 * @date:2024/12/25 20:37
 * @author: Junquan Yi
 */
public class Solution {
    // 49. 字母异位词分组,middle
    // 题目: https://leetcode.cn/problems/group-anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> hashMap = new HashMap<String, List<String>>();
        for (String temp : strs) {
            String str = getCharCount(temp);
            if (hashMap.containsKey(str)) {
                hashMap.get(str).add(temp);
            }else {
                List<String> list = new ArrayList<>();
                list.add(temp);
                hashMap.put(str, list);
            }
        }
        for(List<String> list : hashMap.values()) {
            result.add(list);
        }
        return result;
    }

    public static String getCharCount(String s) {
        int[] counts = new int[26];
        for(char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(counts[i] > 0) {
                sb.append((char)(i + 'a'));
                sb.append(counts[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String hash1 = getCharCount("abc");
        String hash2 = getCharCount("cab");
        System.out.println(hash1.equals(hash1));
        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(result);
    }
}
