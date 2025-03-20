package dp.backpack;

/**
 * ClassName:Main
 * Package:dp.backpack
 * Description:
 *
 * @date:2025/3/17 20:21
 * @author: Junquan Yi
 */
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] cost = new int[m];
        int[] value = new int[m];
        for(int i = 0 ; i < m; i++){
            cost[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < m; i++){
            value[i] = scanner.nextInt();
        }
        int[][] dp = new int[m][n+1];
        for(int j = cost[0]; j <= n ; j++){
            dp[0][j] = value[0];
        }

        for(int i = 1 ; i < m ; i++){
            for(int j = 0; j <= n ; j++){
                if(j >= cost[i]){
                    dp[i][j] = Math.max(dp[i-1][j-cost[i]]+ value[i], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }

            }
        }
        System.out.print(dp[m-1][n]);
    }


}