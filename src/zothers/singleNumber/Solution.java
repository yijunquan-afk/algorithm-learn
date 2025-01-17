package zothers.singleNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * Package:zothers.singleNumber
 * Description:
 *
 * @date:2025/1/16 21:46
 * @author: Junquan Yi
 */
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
