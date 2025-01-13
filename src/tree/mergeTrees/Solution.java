package tree.mergeTrees;

import tree.TreeNode;

/**
 * ClassName:Slution
 * Package:tree.mergeTrees
 * Description:
 *
 * @date:2025/1/12 15:18
 * @author: Junquan Yi
 */
public class Solution {
    // 617. 合并二叉树
    // https://leetcode.cn/problems/merge-two-binary-trees/description/
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }

    public TreeNode merge(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }else if (root1 != null && root2 == null) {
            return root1;
        }else if (root2 != null && root1 == null) {
            return root2;
        }
        TreeNode root = new TreeNode(root1.val + root2.val);
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;
    }
}
