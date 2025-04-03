package tree.bst.isValidBST;

import tree.TreeNode;

import java.util.Stack;

/**
 * ClassName:Solution
 * Package:tree.bst.isValidBST
 * Description:
 *
 * @date:2025/1/12 21:32
 * @author: Junquan Yi
 */
public class Solution {
    // 98. 验证二叉搜索树
    // https://leetcode.cn/problems/validate-binary-search-tree/description/
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean left = isValidBST(root.left);

        if( pre!= null && root.val <= pre.val) return false;
        pre = root;
        boolean right = isValidBST(root.right);
        return left && right;
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null) return true;
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                if (pre != null && pre.val >= cur.val) return false;
                pre = cur;
                cur = cur.right;
            }
        }
        return true;
    }
}
