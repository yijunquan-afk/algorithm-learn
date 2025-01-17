package tree.diameterOfBinaryTree;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.diameterOfBinaryTree
 * Description:
 *
 * @date:2025/1/17 20:36
 * @author: Junquan Yi
 */
public class Solution {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        ans = Math.max(ans, left + right );
        return Math.max(left, right) + 1;
    }
}
