package array.removeDuplicates2;

/**
 * ClassName:Solution
 * Package:array.removeDuplicates2
 * Description:
 *
 * @date:2025/1/3 15:16
 * @author: Junquan Yi
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 2, fast = 2;
        if(nums == null || nums.length <= 2) return nums.length;
        while (fast < nums.length) {
            if (nums[slow-2] != nums[fast]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution solution = new array.removeDuplicates2.Solution();
        System.out.println(solution.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}
