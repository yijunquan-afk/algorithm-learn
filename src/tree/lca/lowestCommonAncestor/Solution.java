package tree.lca.lowestCommonAncestor;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.lca.lowestCommonAncestor
 * Description:
 *
 * @date:2025/1/14 10:47
 * @author: Junquan Yi
 */
public class Solution {
    // 236. 二叉树的最近公共祖先
    // https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/description/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return right != null ? right : left;
    }
}
