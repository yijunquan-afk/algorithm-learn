package array.binarysearch.searchRotate2;

/**
 * ClassName:Solution
 * Package:array.binarysearch.searchRotate2
 * Description:
 *
 * @date:2025/2/27 12:08
 * @author: Junquan Yi
 */
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if(n==1) return nums[0] == target ? true : false;
        int left = 0 , right = n - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return true;
            if(nums[left] == nums[mid] ){
                left++;
                continue;
            }
            if(nums[right] == nums[mid]){
                right--;
                continue;
            }
            if(nums[left] <= nums[mid]){ // 左边有序
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{ // 右边有序
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}