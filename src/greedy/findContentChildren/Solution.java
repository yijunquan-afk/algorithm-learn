package greedy.findContentChildren;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:greedy.findContentChildren
 * Description:
 *
 * @date:2025/1/21 15:12
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/assign-cookies/
    // 455. 分发饼干
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sum = 0;
        int i = 0, j = 0;
        while (true) {
            if (j >= s.length || i >= g.length) {
                break;
            }
            if (s[j] >= g[i]) {
                sum++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{1,1};
        System.out.println(solution.findContentChildren(g, s));
    }
}
