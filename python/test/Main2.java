package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName:Main2
 * Package:test
 * Description:
 *
 * @date:2025/3/23 17:17
 * @author: Junquan Yi
 */
public class Main2 {
    // 避免重复计算
    static Map<Long, Boolean> luckyNumMap = new HashMap<>();
    static int getLuckySum(long left, long right){
        int res = 0;
        for(long i = left; i <= right ; i++){
            if(luckyNumMap.containsKey(i)){
                if(luckyNumMap.get(i)){
                    res++;
                }
            }else{
                boolean temp = isLucky((i));
                if(temp){
                    res++;
                }
                luckyNumMap.put(i, temp);
            }
        }
        return res;
    }
    static boolean isLucky(long number){
        if(number % 3 == 0) return true; // 本身就是3的倍数
        String str = number + "";
        int n = str.length();
        for(int i = 0 ; i < n; i++){
            for(int j = i ; j < n; j++){
                String substr = str.substring(i, j+1);
                int num = Integer.parseInt(substr);
                if(num % 3 == 0) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0 ; i < n ; i++){
            long left = in.nextLong();
            long right = in.nextLong();
            long res = getLuckySum(left, right);
            System.out.println(res);
        }
    }
}
