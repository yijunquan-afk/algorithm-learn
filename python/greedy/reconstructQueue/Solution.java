package greedy.reconstructQueue;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:greedy.reconstructQueue
 * Description:
 *
 * @date:2025/1/27 10:53
 * @author: Junquan Yi
 */
public class Solution {
    // 406. 根据身高重建队列
    // https://leetcode.cn/problems/queue-reconstruction-by-height/description/
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b)->{
            if(a[0] == b[0]) return a[1]-b[1];
            return b[0] - a[0]; // 从大到小排列
        }); // 先按身高排序，同身高k小的优先
        LinkedList<int []> q = new LinkedList<>();
        for(int[] p : people){
            q.add(p[1], p); // 将p插入到指定下标
        }
        return q.toArray(new int[people.length][]);
    }
}
