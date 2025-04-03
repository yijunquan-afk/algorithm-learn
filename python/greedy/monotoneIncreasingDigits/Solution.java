package greedy.monotoneIncreasingDigits;

import java.util.*;

/**
 * ClassName:Solution
 * Package:greedy.monotoneIncreasingDigits
 * Description:
 *
 * @date:2025/1/29 18:49
 * @author: Junquan Yi
 */
public class Solution {
    // 738. 单调递增的数字
    // https://leetcode.cn/problems/monotone-increasing-digits/
    public int monotoneIncreasingDigits(int n) {
        if(n < 10){
            return n;
        }
        char[] digits = (n+"").toCharArray();
        int nineFlag = digits.length;
        for(int j = digits.length - 1; j >= 1; j--){
            if(digits[j] < digits[j - 1]){
                digits[j-1]--;
                nineFlag = j;
            }
        }

        for(int i = nineFlag; i < digits.length ; i++){
            digits[i] = '9';
        }
        return Integer.parseInt(String.valueOf(digits));
    }
    int[] getNumbers(int number){
        int n = (number + "").length();
        int[] numbers = new int[n];
        int i = 1;
        while(i <= n){
            numbers[n-i] =number % 10;
            number = number / 10;
            i++;
        }
        return numbers;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.getNumbers(123)));
        System.out.println(Integer.parseInt("0010"));
        System.out.println(solution.monotoneIncreasingDigits(332));
    }
}
