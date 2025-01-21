package greedy.wiggleMaxLength;

/**
 * ClassName:Solution
 * Package:greedy.wiggleMaxLength
 * Description:
 *
 * @date:2025/1/21 15:49
 * @author: Junquan Yi
 */
public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1){
            return  1;
        }
        boolean up = true;
        boolean down = true;
        int res = 1;
        for(int i = 1 ;i < nums.length; i++) {
            if (down && nums[i] > nums[i - 1]) {
                up = true;
                down = false;
                res++;
            } else if (up && nums[i] < nums[i - 1]){
                down = true;
                up = false;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,7,4,9,2,5};
        System.out.println(solution.wiggleMaxLength(nums));
    }
}
