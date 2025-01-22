package greedy.jump;

/**
 * ClassName:Solutionm
 * Package:greedy.jump
 * Description:
 *
 * @date:2025/1/22 22:54
 * @author: Junquan Yi
 */
public class Solution {
    // 45. 跳跃游戏 II
    // https://leetcode.cn/problems/jump-game-ii/description/
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int n = nums.length;
        int maxCover = 0;
        int step = 0;
        for(int i = 0; i < n; i++){
            step++;
            maxCover = Math.max(maxCover, i + nums[i]);
            if(maxCover >= nums.length - 1){
                return step;
            }
            if(maxCover > i){
                int tempMax = i + 1;
                for(int j = i + 2; j <= maxCover; j++){
                    if(j + nums[j] >= tempMax + nums[tempMax]){ // 能跳最远的下一跳
                        tempMax = j;
                    }
                }
                i = tempMax - 1;// 下一跳
            }

        }
        return step;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 1, 1};
        System.out.println(solution.jump(nums));
    }
}
