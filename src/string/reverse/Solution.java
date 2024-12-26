package string.reverse;

/**
 * ClassName:Solution
 * Package:string.reverse
 * Description:
 *
 * @date:2024/12/24 20:06
 * @author: Junquan Yi
 */
public class Solution {
    // 反转字符串，easy
    // 题目：https://leetcode.cn/problems/reverse-string/submissions/589081856/
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = "abcdefghijklmnop".toCharArray();
        solution.reverseString(s);
        for (char c : s) {
            System.out.print(c);
        }
    }
}
