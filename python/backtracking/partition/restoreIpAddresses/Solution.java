package backtracking.partition.restoreIpAddresses;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:backtracking.partition.restoreIpAddresses
 * Description:
 *
 * @date:2025/1/9 16:14
 * @author: Junquan Yi
 */
public class Solution {
    // 93. 复原 IP 地址
    // https://leetcode.cn/problems/restore-ip-addresses/description/
    List<String> res = new ArrayList<>();
    List<String> ipNumber = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if (s.length()< 4 || s.length() > 12) return res;
        backtracking(s, 0);
        return res;
    }

    void backtracking(String s, int startIndex){
        if(ipNumber.size() == 3){
            // 不用再进递归，直接判断剩下的那一个
            String sub = s.substring(startIndex);
            if(!isValid(sub)) return;
            String ip = "";
            for(int i = 0; i < 3; i++){
                ip += ipNumber.get(i) + ".";
            }
            ip += sub;
            res.add(ip);
            return;
        }

        for(int i = startIndex; i < s.length(); i++){
            String sub = s.substring(startIndex, i + 1);
            if(!isValid(sub)) break;
            ipNumber.add(sub);
            backtracking(s, i + 1);
            ipNumber.remove(ipNumber.size() - 1);
        }


    }

    boolean isValid(String sub){
        if(sub.length() == 0) return false;
        if(sub.charAt(0) == '0' && sub.length() > 1){
            return false;
        }// 避免0重复
        if(sub.length() > 3) return false;
        int number = Integer.parseInt(sub);
        if (number > 255){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.restoreIpAddresses("9245587303"));
    }
}
