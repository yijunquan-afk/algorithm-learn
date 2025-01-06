package array.isPalindrome;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:array.isPalindrome
 * Description:
 *
 * @date:2025/1/6 20:51
 * @author: Junquan Yi
 */
public class Solution {
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if ( c >= 'a' && c <= 'z' ) {
                list.add(c);
            }
            if ( c >= '0' && c <= '9' ) {
                list.add(c);
            }
        }
        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("aba"));
    }
}
