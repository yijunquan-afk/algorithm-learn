package string.reverse2;

/**
 * ClassName:Solution
 * Package:string.reverse2
 * Description:
 *
 * @date:2024/12/24 20:10
 * @author: Junquan Yi
 */
public class Solution {
    // 反转字符串2，easy
    // https://leetcode.cn/problems/reverse-string-ii/description/
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < s.length(); i += 2 * k) {
            int j = Math.min(i * k, s.length()) - 1;
            reverseString(chars, i, j);
        }
        return new String(chars);
    }

    public void reverseString(char[] s, int left, int right) {
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
        System.out.println(solution.reverseStr("abcdefg", 3));
    }
}
