package array.binarysearch.searchMatrix2;

/**
 * ClassName:Solution
 * Package:array.binarysearch.searchMatrix2
 * Description:
 *
 * @date:2025/3/12 20:43
 * @author: Junquan Yi
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index = 0;
        for(int[] nums : matrix){
            index = binarSearch(nums, target);
            if(index >= 0 ) return true;
        }
        return false;
    }


    int binarSearch(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
