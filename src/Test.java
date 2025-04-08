import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Test {
    // static boolean isLuckyNumber(long number, int x, int k){
    //     if(number < 10) {
    //         if(number == x && k == 1){
    //             return true;
    //         }else{
    //             return false;
    //         }

    //     }
    //     int[] numMap = new int[11];
    //     while(number >= 10){
    //         int digit = (int)(number % 10);
    //         number = number/10;
    //         numMap[digit]++;
    //     }
    //     numMap[(int)number]++;
    //     if(numMap[x] == k) return true;
    //     return false;
    // }

    static int[] isLuckyNumber(long number, int x, int k){
        int[] numMap = new int[11];
        while(number >= 10){
            int digit = (int)(number % 10);
            number = number/10;
            numMap[digit]++;
        }
        numMap[(int)number]++;
        return numMap;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T ;i++){
            long l = in.nextLong();
            long r = in.nextLong();
            int x = in.nextInt();
            int k = in.nextInt();

            long res = 0;
            int[] numMap = new int[11];
            int lastDigit = -1;
            for(long j = l; j <= r; j++){
                if(j < 10){
                    if(j == x && k == 1){
                        res++;
                    }
                    continue;
                }
                int curDigit = (int)(j % 10);
                if(lastDigit == 9 || j == 10 || j == l){
                    numMap = isLuckyNumber(j, x, k);
                }else{
                    numMap[lastDigit]--;
                    numMap[curDigit]++;
                }
                if(numMap[x] == k) res++;
                lastDigit = curDigit;
            }
            System.out.println(res);
        }
    }
}