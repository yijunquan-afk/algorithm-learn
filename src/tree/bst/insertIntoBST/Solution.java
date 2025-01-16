package tree.bst.insertIntoBST;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.bst.insertIntoBST
 * Description:
 *
 * @date:2025/1/15 11:48
 * @author: Junquan Yi
 */
public class Solution {
    // 701. 二叉搜索树中的插入操作
    // https://leetcode.cn/problems/insert-into-a-binary-search-tree/description/
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
