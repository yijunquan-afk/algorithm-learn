package tree.countNodes;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:tree.countNodes
 * Description:
 *
 * @date:2025/1/7 15:51
 * @author: Junquan Yi
 */
public class Solution {
    // 222. 完全二叉树的节点个数
    // https://leetcode.cn/problems/count-complete-tree-nodes/description/
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int countNodes2isBalanced(TreeNode root) {
        if (root == null) return 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftDepth = 0, rightDepth = 0; // 这里初始为0是有目的的，为了下面求指数方便
        while (left != null) {  // 求左子树深度
            left = left.left;
            leftDepth++;
        }
        while (right != null) { // 求右子树深度
            right = right.right;
            rightDepth++;
        }
        if (leftDepth == rightDepth) {
            return (2 << leftDepth) - 1; // 注意(2<<1) 相当于2^2，所以leftDepth初始为0
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
