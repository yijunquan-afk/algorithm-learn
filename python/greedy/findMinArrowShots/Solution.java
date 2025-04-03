package greedy.findMinArrowShots;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:greedy.findMinArrowShots
 * Description:
 *
 * @date:2025/1/27 11:10
 * @author: Junquan Yi
 */
public class Solution {
    // 452. 用最少数量的箭引爆气球
    // https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/description/
    public int findMinArrowShots(int[][] points) {
        // 不会溢出
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 1;  // points 不为空至少需要一支箭
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {  // 气球i和气球i-1不挨着，注意这里不是>=
                count++; // 需要一支箭
            } else {  // 气球i和气球i-1挨着
                points[i][1] = Math.min(points[i][1], points[i - 1][1]); // 更新重叠气球最小右边界
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] points = new int[][]{{-2147483646,-2147483645}, {2147483646,2147483647}};
//        int[][] points = new int[][]{{0,1}, {2,3}};
        System.out.println(solution.findMinArrowShots(points));
    }

}
