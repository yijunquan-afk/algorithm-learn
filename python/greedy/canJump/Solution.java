package greedy.canJump;

/**
 * ClassName:Solution
 * Package:greedy.canJump
 * Description:
 *
 * @date:2025/1/21 16:44
 * @author: Junquan Yi
 */
public class Solution {
    // 55. 跳跃游戏
    // https://leetcode.cn/problems/jump-game/description/
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int maxCover = 0;
        for(int i = 0 ; i <= maxCover; i++){
            if(nums[i] + i > maxCover){
                maxCover = nums[i] + i;
            }
            if(maxCover >= nums.length){
                return true;
            }
        }
        return  false;
    }
}
