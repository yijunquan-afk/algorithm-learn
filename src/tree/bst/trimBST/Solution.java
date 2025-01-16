package tree.bst.trimBST;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.bst.trimBST
 * Description:
 *
 * @date:2025/1/15 19:36
 * @author: Junquan Yi
 */
public class Solution {
    // 669. 修剪二叉搜索树
    // https://leetcode.cn/problems/trim-a-binary-search-tree/description/
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;
        if(root.val < low){ // 向右边去寻找区间内的节点
            TreeNode right = trimBST(root.right, low, high);
            return  right;
        }else if(root.val > high){ // 向左边去寻找区间内的节点
            TreeNode left = trimBST(root.left, low, high);
            return  left;
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
