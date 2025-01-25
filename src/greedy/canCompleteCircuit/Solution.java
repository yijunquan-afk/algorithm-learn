package greedy.canCompleteCircuit;

/**
 * ClassName:Solution
 * Package:greedy.canCompleteCircuit
 * Description:
 *
 * @date:2025/1/24 11:42
 * @author: Junquan Yi
 */
public class Solution {
    // 134. 加油站
    // https://leetcode.cn/problems/gas-station/description/
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int leftsSum = 0;
        int gasSum = 0;
        int costSum = 0;
        int n = gas.length;
        int start = 0;
        for(int i = 0 ; i < n; i++){
            gasSum += gas[i];
            costSum += cost[i];
            leftsSum += gas[i] - cost[i];
            if(leftsSum < 0){
                leftsSum = 0;
                start = -1;
            }else{
                if(start == -1) start = i;
            }
        }
        return gasSum - costSum > 0 ? start : -1;
    }
}
