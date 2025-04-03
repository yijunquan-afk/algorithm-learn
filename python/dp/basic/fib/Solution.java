package dp.basic.fib;

/**
 * ClassName:Solution
 * Package:dp.basic.fib
 * Description:
 *
 * @date:2025/1/30 12:54
 * @author: Junquan Yi
 */
public class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            int temp = dp[1];
            dp[1] = dp[0] + temp;
            dp[0] = temp;
        }
        return dp[1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(4));
    }
}
