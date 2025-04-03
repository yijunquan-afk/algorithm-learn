package greedy.eraseOverlapIntervals;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:greedy.eraseOverlapIntervals
 * Description:
 *
 * @date:2025/1/27 12:19
 * @author: Junquan Yi
 */
public class Solution {
    // 435. 无重叠区间
    // https://leetcode.cn/problems/non-overlapping-intervals/description/
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if(n < 2){
            return 0;
        }
        Arrays.sort(intervals, (a,b) -> {
            if(a[1] == b[1]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        int count = 0;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < n; i++){
            int start_temp = intervals[i][0];
            int end_temp = intervals[i][1];

            if ((start_temp > start && start_temp < end) ||
                    (end_temp > start && end_temp < end) ||
                    (start_temp <= start && end_temp >= end)) {
                count++;
                continue;
            }
            start = start_temp;
            end = end_temp;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = new int[][]{{1,8}, {2,3}, {3, 4}, {4,5}};
        System.out.println(solution.eraseOverlapIntervals(intervals));
    }
}
