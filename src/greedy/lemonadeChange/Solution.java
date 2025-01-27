package greedy.lemonadeChange;

/**
 * ClassName:Solution
 * Package:greedy.lemonadeChange
 * Description:
 *
 * @date:2025/1/26 21:44
 * @author: Junquan Yi
 */
public class Solution {
    // 860. 柠檬水找零
    // https://leetcode.cn/problems/lemonade-change/
    public boolean lemonadeChange(int[] bills) {
        int[] moneys = new int[2];
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] == 5){
                moneys[0]++;
            }else if(bills[i] == 10){
                if(moneys[0] == 0){
                    return false;
                }
                moneys[1]++;
                moneys[0]--;
            }else if(bills[i] == 20){
                if(moneys[0] == 0){
                    return false;
                }
                if(moneys[1] == 0 && moneys[0] < 3){
                    return false;
                }
                if(moneys[1] > 0){
                    moneys[1]--;
                    moneys[0]--;
                    continue;
                }
                moneys[0] -= 3;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] bills = new int[]{5,5,5,10,5,20,5,10,5,20};
        System.out.println(solution.lemonadeChange(bills));
    }
}
