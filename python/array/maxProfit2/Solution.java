package array.maxProfit2;

/**
 * ClassName:Solution
 * Package:array.maxProfit2
 * Description:
 *
 * @date:2025/1/5 15:31
 * @author: Junquan Yi
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        for (int i = 0; i < n-1; i++) {
            if (prices[i+1] > prices[i]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
