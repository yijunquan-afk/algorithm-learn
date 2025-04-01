package tree.kthSmallest;

import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName:Solution
 * Package:tree.kthSmallest
 * Description:
 *
 * @date:2025/4/1 20:53
 * @author: Junquan Yi
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        int res = root.val;
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            --k;
            if(k == 0){
                res = root.val;
                break;
            }
            root = root.right;
        }
        return res;
    }
}
