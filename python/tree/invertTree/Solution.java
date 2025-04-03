package tree.invertTree;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.invertTree
 * Description:
 *
 * @date:2025/1/7 11:27
 * @author: Junquan Yi
 */
public class Solution {
    // 226. 翻转二叉树, easy
    // https://leetcode.cn/problems/invert-binary-tree/description/
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
