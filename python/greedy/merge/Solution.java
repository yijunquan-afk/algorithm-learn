package greedy.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:Solution
 * Package:greedy.merge
 * Description:
 *
 * @date:2025/1/28 16:47
 * @author: Junquan Yi
 */
public class Solution {
    // 56. 合并区间
    // https://leetcode.cn/problems/merge-intervals/description/
    public int[][] merge(int[][] intervals) {
        // 不会溢出
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int lastEnd =  res.get(res.size()-1)[1];
            if (intervals[i][0] > lastEnd) {
                res.add(intervals[i]);
            } else {
                int start = res.get(res.size()-1)[0];
                res.remove(res.size()-1);
                int end = Math.max(intervals[i][1], lastEnd);
                res.add(new int[]{start, end});
            }
        }
        int[][] mergeRes = new int[res.size()][];
        int idx = 0;
        for(int[] interval : res){
            mergeRes[idx] = interval;
            idx++;
        }
        return mergeRes;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = new int[][]{{2,3},{4,5}, {6,7}, {8,9}, {1,10}};
        System.out.println(solution.merge(intervals));
    }

}
