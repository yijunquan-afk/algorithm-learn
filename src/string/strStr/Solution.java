package string.strStr;

/**
* ClassName:Solution
* Package:string.strStr
* Description:
* @date:2024/12/24 20:36
* @author: Junquan Yi
*/
public class Solution {
    // 实现 strStr(),easy
    // 题目: https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
    // 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 对于本题而言，当 needle 是空字符串时我们应当返回 0 。
    // 这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (!haystack.contains(needle)){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad", "sad"));
    }
}
