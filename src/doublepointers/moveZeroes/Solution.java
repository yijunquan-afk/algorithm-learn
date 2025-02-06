package doublepointers.moveZeroes;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:twopointers.moveZeroes
 * Description:
 *
 * @date:2025/1/16 21:28
 * @author: Junquan Yi
 */
public class Solution {
    // 283. 移动零
    // https://leetcode.cn/problems/move-zeroes/description/?envType=study-plan-v2&envId=top-100-liked
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0, zeros = 0;
        while(fast < nums.length){
            if(nums[fast]!=0) {
                nums[slow++] = nums[fast];
            }else{
                zeros++;
            }
            fast++;
        }
        for(int i = nums.length - 1; i > nums.length - zeros - 1; i--){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0,1,0,3,12};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
