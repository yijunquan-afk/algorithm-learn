package tree.bst.getMinimumDifference;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.bst.getMinimumDifference
 * Description:
 *
 * @date:2025/1/13 18:43
 * @author: Junquan Yi
 */
public class Solution {
    TreeNode pre = null;
    int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getMinimumDifference(root.left);
        if (pre != null && root.val - pre.val < minDiff) {
            minDiff = root.val - pre.val;
        }
        pre = root;
        getMinimumDifference(root.right);
        return minDiff;
    }
}
