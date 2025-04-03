package array.prefixsum;

import java.util.Scanner;

/**
 * ClassName:Main
 * Package:array.prefixsum
 * Description:
 *
 * @date:2024/12/21 16:53
 * @author: Junquan Yi
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            prefixSum += arr[i];
            sum[i] = prefixSum;
        }
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sumNum = 0;
            if (a == 0){
                sumNum = sum[b];
            }else{
                sumNum = sum[b] - sum[a - 1];
            }
            System.out.println(sumNum);
        }
        scanner.close();
    }
}
