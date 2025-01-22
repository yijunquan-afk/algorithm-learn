package backtracking.permute.generateParenthesis;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ClassName:Solution
 * Package:backtracking.permute.generateParenthesis
 * Description:
 *
 * @date:2025/1/22 22:26
 * @author: Junquan Yi
 */
public class Solution {
    // 22. 括号生成
    // https://leetcode.cn/problems/generate-parentheses/
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtracking(n, n, "");
        return res;
    }

    void backtracking(int left, int right, String path){
        /*
          1 括号肯定都要用完才算结束
          2 左括号和右括号的数量一定相等
          3 但是数量相等不一定是有效括号比如())()(
          4 但是如果先有左括号，才能有右括号+左右数量相等就一定是有效括号
          5 上一句话翻译后的具体操作就是如果有一个左括号就可以有一个右括号，有两个左就可以有两个右，但是有两个左不可以有三个右以此类推。
          6 上一句话的代码实现方法是记左的个数为left右为right,left/right初始值为n，有：left > 0 可以使用左括号，但是left < right，才可以使用右。left=right=0为结果。
        */
        if(left ==0 && right == 0){
            res.add(path);
            return;
        }
        if(left > 0){
            backtracking(--left, right, path+"(");
        }
        if(right > left){
            backtracking(left, --right, path+")");
        }
    }
}
