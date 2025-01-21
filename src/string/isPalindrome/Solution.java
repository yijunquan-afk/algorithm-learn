package string.isPalindrome;

/**
 * ClassName:Solution
 * Package:string.isPalindrome
 * Description:
 *
 * @date:2025/1/19 22:17
 * @author: Junquan Yi
 */
public class Solution {
    public boolean isPalindrome(int x) {
        char[] str = String.valueOf(x).toCharArray();
        for(int i = 0, j = str.length-1; i < j; i++, j--){
            if(str[i] != str[j]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf(-12));
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }
}
