package array.majorityElement;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * Package:array.majorityElement
 * Description:
 *
 * @date:2025/1/4 11:04
 * @author: Junquan Yi
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }
}
