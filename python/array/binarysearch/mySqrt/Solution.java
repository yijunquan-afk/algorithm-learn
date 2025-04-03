package array.binarysearch.mySqrt;

/**
 * ClassName:Solution
 * Package:array.binarysearch.mySqrt
 * Description:
 *
 * @date:2025/2/26 22:41
 * @author: Junquan Yi
 */
class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int left = 0 , right = x/2;
        while(left <= right){
            int mid = left + (right - left)/2;
            long temp = (long) mid * mid;
            if(temp == x){
                return mid;
            }else if(temp < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(2147395599));
    }
}
