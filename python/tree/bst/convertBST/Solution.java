package tree.bst.convertBST;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.bst.convertBST
 * Description:
 *
 * @date:2025/1/13 20:56
 * @author: Junquan Yi
 */
public class Solution {
    // 538. 把二叉搜索树转换为累加树
    // https://leetcode.cn/problems/convert-bst-to-greater-tree/description/
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode right = convertBST(root.right);
        sum += root.val;
        TreeNode node = new TreeNode(sum);
        TreeNode left = convertBST(root.left);
        node.left = left;
        node.right = right;
        return node;
    }
}
