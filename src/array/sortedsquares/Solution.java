package array.sortedsquares;

/**
 * ClassName:Solution
 * Package:array.sortedsquares
 * Description:
 *
 * @date:2024/12/19 14:37
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/squares-of-a-sorted-array/
    // 解答: https://programmercarl.com/0977.%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84%E5%B9%B3%E6%96%B9.html#%E7%AE%97%E6%B3%95%E5%85%AC%E5%BC%80%E8%AF%BE
    public int[] sortedSquares(int[] nums) {
        // 双指针：数组平方的最大值就在数组的两端，不是最左边就是最右边，不可能是中间。
        int left = 0, right = nums.length - 1;
        int [] res = new int[nums.length];
        int index = nums.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[index--] = nums[left] * nums[left];
                ++left;
            }else {
                res[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return res;
    }
}
