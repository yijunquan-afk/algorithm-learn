package array.rotate;

/**
 * ClassName:Solution
 * Package:array.rotate
 * Description:
 *
 * @date:2025/1/4 11:14
 * @author: Junquan Yi
 */
public class Solution {
    // 189. 轮转数组, middle
    // https://leetcode.cn/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

    // 数组翻转，不需要额外空间
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    // 需要额外空间
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        int slow = 0, fast = n - k % n;
//        int[] temp = new int[n];
//        for(int i = 0; i < n; i++){
//            temp[i] = nums[i];
//        }
//        for(int i = 0; i < n; i++){
//            nums[i] = temp[fast%n];
//            fast ++;
//        }
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
    }
}
