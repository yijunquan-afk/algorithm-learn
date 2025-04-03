package stackqueue.topKFrequent;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * ClassName:Solution
 * Package:stackqueue.topKFrequent
 * Description:
 *
 * @date:2024/12/26 20:42
 * @author: Junquan Yi
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 使用小顶堆
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1]-o2[1]); // 出现频率越小越在顶端
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] res = new int[k];
        for(int i = k - 1; i >= 0; i--){
            res[i] = pq.poll()[0];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,0,1,0};
        int[] res = solution.topKFrequent(nums, 1);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
