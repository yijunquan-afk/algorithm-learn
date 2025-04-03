package doublepointers.productExceptSelf;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:doublepointers.productExceptSelf
 * Description:
 *
 * @date:2025/2/6 21:48
 * @author: Junquan Yi
 */
public class Solution {
    // 238. 除自身以外数组的乘积
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int start = 0 , end = n-1;
        int leftProduct = 1, rightProduct = 1;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        while(start <= n-1 && end >=0){
            res[start] = res[start] * leftProduct;
            res[end] = res[end] * rightProduct;
            leftProduct *= nums[start];
            rightProduct *= nums[end];
            start++;
            end--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,4};
        System.out.println(solution.productExceptSelf(nums));
    }
}
