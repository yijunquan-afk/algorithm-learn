package array.removeDuplicates;

/**
 * ClassName:Solution
 * Package:array.removeDuplicates
 * Description:
 *
 * @date:2025/1/2 20:29
 * @author: Junquan Yi
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        int res = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
                res++;
            }
            fast++;
        }
        return res + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{1,1,2}));
    }
}
