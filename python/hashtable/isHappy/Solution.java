package hashtable.isHappy;

import java.util.HashSet;

/**
 * ClassName:Solution
 * Package:hashtable.isHappy
 * Description:
 *
 * @date:2024/12/23 18:31
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/happy-number/
    // 快乐数, easy
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while (getSquare(n) != 1) {
            if (set.contains(getSquare(n))) {
                return false;
            }
            n = getSquare(n);
            set.add(n);
        }
        return true;
    }


    public static int getSquare(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getSquare(100));
        Solution solution = new Solution();
        System.out.println(solution.isHappy(2));
    }
}
