package array.totalfruit;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * Package:array.totalfruit
 * Description:
 *
 * @date:2024/12/19 15:46
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/fruit-into-baskets/
    // 904. 水果成篮, middle
    public int totalFruit(int[] fruits) {
        int maxLen = 0;
        int start = 0, end = 0;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (; end < fruits.length; end++) {
            cnt.put(fruits[end], cnt.getOrDefault(fruits[end], 0) + 1);
            while(cnt.size() > 2){ // 不断右移，直到少一类
                cnt.put(fruits[start], cnt.getOrDefault(fruits[start], 0) - 1);
                if (cnt.get(fruits[start]) == 0){
                    cnt.remove(fruits[start]);
                }
                start++;

            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }
}
