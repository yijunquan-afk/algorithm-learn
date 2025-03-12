package array.binarysearch.findMin;

/**
 * ClassName:Solution
 * Package:array.binarysearch.findMin
 * Description:
 *
 * @date:2025/3/8 23:01
 * @author: Junquan Yi
 */
public class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int minNum = nums[0];
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1; // x 一定在最小值的左边。
            }else{
                right = mid - 1; // x 要么是最小值，要么在最小值右边。
                minNum = Math.min(minNum, nums[mid]);
            }
        }
        return minNum;
    }
}
