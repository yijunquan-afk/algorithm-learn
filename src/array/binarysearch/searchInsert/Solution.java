package array.binarysearch.searchInsert;

/**
 * ClassName:Solution
 * Package:array.binarysearch.searchInsert
 * Description:
 *
 * @date:2025/2/26 17:18
 * @author: Junquan Yi
 */
class Solution {
    // https://leetcode.cn/problems/search-insert-position/
    // 35. 搜索插入位置
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if(n == 0){
            return nums[0] < target ? 1 : 0;
        }
        int left = 0 , right = n - 1;
        int mid = right + (right - left)/2;
        while(left <= right){
            mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
