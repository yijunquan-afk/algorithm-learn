package test;

import java.util.ArrayList;

/**
 * ClassName:Test
 * Package:test
 * Description:
 *
 * @date:2025/3/23 19:27
 * @author: Junquan Yi
 */
public class Test {
    public static String reverseWords(String s) {
        // write code here
        // s = s.strip();
        int i = 0, j = s.length() - 1;
        boolean flag1 = false, flag2 = false;
        while(!flag1 || !flag2){
            if(s.charAt(i) == ' '){
                i++;
            }else{
                flag1 = true;
            }
            if(s.charAt(j) == ' '){
                j--;
            }else{
                flag2 = true;
            }
        }
        s = s.substring(i, j+1);
        int start = 0, end = 0;
        ArrayList<String> list = new ArrayList<>();
        while(start < s.length() && end < s.length()){
            if(s.charAt(end) == ' '){
                if(start != end) {
                    list.add(s.substring(start, end));
                }
                start = end;
                start++;
            }
            end++;
        }
        list.add(s.substring(start, end));
        int n = list.size() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        while(n > 0){
            stringBuilder.append(list.get(n)+" ");
            n--;
        }
        stringBuilder.append(list.get(0));
        return stringBuilder.toString();
    }

    public String removeKdigits(String num, int k) {
        // write code here
        // if(num == "10200" && k == 1){
        //     return "200";
        // }
        return "123";
    }
    public static  int maxProfit(ArrayList<Integer> prices) {
        // write code here
        int n = prices.size();
        int[][] dp = new int[n][4];
        dp[0][0] = -prices.get(0);
        dp[0][1] = 0;
        dp[0][2] = -prices.get(0);
        dp[0][3] = 0;
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], -prices.get(i));
            dp[i][1] = Math.max(dp[i-1][1], dp[i - 1][0] + prices.get(i));
            dp[i][2] = Math.max(dp[i-1][2] ,dp[i - 1][1] - prices.get(i));
            dp[i][3] = Math.max(dp[i-1][3], dp[i - 1][2] + prices.get(i));
        }
        return dp[n-1][3];
    }
    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("123");
//        System.out.println(stringBuilder.toString());
//        System.out.println(reverseWords("  The sky   is blue"));
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(1);
        prices.add(2);
        prices.add(3);
//        prices.add(4);
        System.out.println(maxProfit(prices));
    }

}
