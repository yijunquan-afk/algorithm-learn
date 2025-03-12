package zothers.majorityElement;

/**
 * ClassName:Solution
 * Package:zothers.majorityElement
 * Description:
 *
 * @date:2025/3/8 23:44
 * @author: Junquan Yi
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for (int num : nums){
            if (votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }
}
