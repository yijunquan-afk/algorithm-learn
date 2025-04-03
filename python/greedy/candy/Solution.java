package greedy.candy;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:greedy.candy
 * Description:
 *
 * @date:2025/1/25 18:18
 * @author: Junquan Yi
 */
public class Solution {
     // 135. 分发糖果, hard
    // https://leetcode.cn/problems/candy/description/
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candys = new int[n];
        candys[0] = 1;
        for(int i  = 1 ; i < n ; i++){ // 从左向右遍历
            if(ratings[i] > ratings[i - 1]){ // 右边大于左边
                candys[i] = candys[i-1] + 1;
            }else{
                candys[i] = 1;
            }
        }

        for(int i = n - 2; i >= 0; i--){ // 左边大于右边
            if(ratings[i] > ratings[i+1]){
                candys[i] = Math.max(candys[i], candys[i + 1]+1);
            }
        }
        int sum = 0;
        for(int num : candys){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ratings = new int[]{1,0,2};
        System.out.println(solution.candy(ratings));

    }
}
