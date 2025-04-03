package tree.isBalanced;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.isBalanced
 * Description:
 *
 * @date:2025/1/7 16:06
 * @author: Junquan Yi
 */
public class Solution {
    // 110. 平衡二叉树
    // https://leetcode.cn/problems/balanced-binary-tree/description/
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        getHeight(root);
        return balanced;
    }

    int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            balanced = false;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
