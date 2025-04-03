package array.binarysearch.searchRange;

/**
 * ClassName:Solution
 * Package:array.binarysearch.searchRange
 * Description:
 *
 * @date:2025/2/26 21:07
 * @author: Junquan Yi
 */
class Solution {
    public int binarySearh(int[] nums, int target){
        int n = nums.length;
        int left = 0 , right = n - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        // 循环结束后 left = right+1
        // 此时 nums[left-1] < target 而 nums[left] = nums[right+1] >= target
        // 所以 left 就是第一个 >= target 的元素下标

        return left;
    }
    public int[] searchRange(int[] nums, int target) {
        int start = binarySearh(nums, target);// >=target的第一个元素
        if(start == nums.length || nums[start] != target){
            return new int[]{-1,-1};
        }
        int end = binarySearh(nums, target+1)-1;
        return new int[]{start, end};
    }
}
