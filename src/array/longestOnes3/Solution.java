package array.longestOnes3;

/**
 * ClassName:Solution
 * Package:array.longestOnes3
 * Description:
 *
 * @date:2024/12/20 22:25
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/max-consecutive-ones-iii/description/
    // 1004, 最大连续1的个数3️⃣，middle
    public int longestOnes(int[] nums, int k) {
        int longestNum = 0;
        int start = 0;
        int curFlip = k;
        for (int end = 0; end < nums.length; end++){
            if (nums[end] == 0){
                curFlip--;
            }
            while (curFlip < 0){
                if (nums[start] == 0){
                    curFlip++;
                }
                start++;
            }
            longestNum = Math.max(longestNum, end - start + 1);
        }
        return longestNum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}
