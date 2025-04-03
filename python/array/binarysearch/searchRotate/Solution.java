package array.binarysearch.searchRotate;

/**
 * ClassName:Solution
 * Package:array.binarysearch.searchRotate
 * Description:
 *
 * @date:2025/2/27 10:57
 * @author: Junquan Yi
 */
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n==0) return -1;
        if(n==1) return nums[0] == target ? 0 : -1;
        int left = 0, right = n - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[0] < nums[mid]){ // 左边有序
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{//右边有序
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{1,0,1,1,1}, 0));
    }
}
