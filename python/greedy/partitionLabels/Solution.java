package greedy.partitionLabels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:Solution
 * Package:greedy.partitionLabels
 * Description:
 *
 * @date:2025/1/28 16:21
 * @author: Junquan Yi
 */
public class Solution {
    public List<Integer> partitionLabels(String s) {
        // 763. 划分字母区间
        // https://leetcode.cn/problems/partition-labels/description/
        int[][]map = new int[26][2]; // 记录字母的首次出现index和最后出现index
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map[c-'a'][0] == 0){
                map[c-'a'][0] = i + 1;
                map[c-'a'][1] = i + 1;
            }else {
                map[c-'a'][1] = i + 1;
            }
        }
        int idx = 0;
        List<Integer> res = new ArrayList<>();
        while(idx < s.length()){
            char c = s.charAt(idx);
            int startIdx = map[c-'a'][0] - 1;
            int endIdx = map[c-'a'][1] - 1;
            for(int j = startIdx + 1; j < endIdx; j++){
                endIdx = Math.max(endIdx, map[s.charAt(j) - 'a'][1] -1 ); // 更新右区间
            }
            idx = endIdx + 1;
            res.add(idx - startIdx);

        }
        return  res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "ababcbacadefegdehijhklij";
        System.out.println(solution.partitionLabels(s));
    }
}
