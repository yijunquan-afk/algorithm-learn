package array.binarysearch;

/**
 * ClassName:Solution
 * Package:array.binarysearch
 * Description:
 *
 * @date:2024/12/19 11:22
 * @author: Junquan Yi
 */
public class Solution {
    // leetcode: https://leetcode.cn/problems/binary-search
    // 解答: https://programmercarl.com/0704.%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE.html#%E6%80%9D%E8%B7%AF
    public int search(int[] nums, int target) {
        if(nums.length == 1) return nums[0] == target ? -1 : 0;
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,  6};
        Solution solution = new Solution();
        System.out.println(solution.search(nums, 6));
    }
}
