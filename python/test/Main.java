package test;

/**
 * ClassName:Main
 * Package:test
 * Description:
 *
 * @date:2025/3/23 16:10
 * @author: Junquan Yi
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
import java.util.Scanner;
import java.util.Stack;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] students = new int[n];
        for(int i = 0 ; i < n ; i++){
            students[i] = in.nextInt();
        }
        int res = 0;
        Stack<Integer> stack = new Stack<>(); // 使用单调递减栈
        stack.push(n-1);
        for(int i = n - 2 ; i >= 0 ; i--){
            while(!stack.isEmpty() && students[i] > students[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res += n -1 - i;
            }else{
                res += stack.peek() - i;
            }
            stack.push(i);
        }
        System.out.println(res);
    }
}
