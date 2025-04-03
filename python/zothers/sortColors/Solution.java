package zothers.sortColors;

/**
 * ClassName:Solution
 * Package:zothers.sortColors
 * Description:
 *
 * @date:2025/3/20 16:36
 * @author: Junquan Yi
 */
public class Solution {
    public void sortColorsHash(int[] nums) {
        int[] numMap = new int[3];
        for(int num : nums){
            numMap[num]++;
        }
        int cur = 0;
        for(int i = 0 ; i < nums.length ; i++){
            while(numMap[cur] == 0){
                cur++;
            }
            numMap[cur]--;
            nums[i] = cur;
        }
    }
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1, current = 0;
        while(current <= right){
            if(nums[current] == 1){
                current++;
            } else if (nums[current] == 0) {
                swap(nums, left, current);
                left++;
                current++;
            } else if (nums[current] == 2) {
                swap(nums, current, right);
                right--;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
