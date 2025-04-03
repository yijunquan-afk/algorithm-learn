package hashtable.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:Solution
 * Package:hashtable.fourSum
 * Description:
 *
 * @date:2024/12/23 20:40
 * @author: Junquan Yi
 */
public class Solution {
    // 四数之和, middle
    // https://leetcode.cn/problems/4sum/
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target && nums[i] >= 0) {
                break; // 剪枝
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // 去重
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j]  > target && nums[i] + nums[j] >= 0) {
                    break;
                }
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }else if (sum < target) {
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
