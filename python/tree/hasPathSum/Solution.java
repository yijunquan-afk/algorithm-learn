package tree.hasPathSum;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.hasPathSum
 * Description:
 *
 * @date:2025/1/10 17:24
 * @author: Junquan Yi
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 112. 路径总和, easy
        // https://leetcode.cn/problems/path-sum/description/
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == targetSum) return true;
        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);
        return leftSum || rightSum;
    }

}
