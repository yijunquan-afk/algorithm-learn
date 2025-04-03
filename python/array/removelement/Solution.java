package array.removelement;

/**
 * ClassName:Solution
 * Package:array.removelement
 * Description:
 *
 * @date:2024/12/19 11:54
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/remove-element/
    // 解法: https://programmercarl.com/0027.%E7%A7%BB%E9%99%A4%E5%85%83%E7%B4%A0.html#%E6%80%9D%E8%B7%AF
    // 使用快慢指针
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 3, 3, 4};
        System.out.println(solution.removeElement(nums, 3));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
