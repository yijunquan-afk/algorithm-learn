package tree.bst.searchBST;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.bst.searchBST
 * Description:
 *
 * @date:2025/1/12 15:35
 * @author: Junquan Yi
 */
public class Solution {
    // 700. 二叉搜索树中的搜索
    // https://leetcode.cn/problems/search-in-a-binary-search-tree/
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}
