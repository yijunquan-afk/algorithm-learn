package tree.traversal.inorderTraversal;

import tree.traversal.inorderTraversal.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:tree.traversal.inorderTraversal
 * Description:
 *
 * @date:2025/1/5 16:01
 * @author: Junquan Yi
 */
public class Solution {
    // 94. 二叉树的中序遍历
    // https://leetcode.cn/problems/binary-tree-inorder-traversal/description/
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversalHelper(res, root);
        return res;
    }

    public void traversalHelper(List<Integer> res, TreeNode root) {
        if(root == null) return;
        traversalHelper(res, root.left); // 左
        res.add(root.val); // 中
        traversalHelper(res, root.right); // 右
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;// 一直往左边走
            }else {
                cur = stack.pop();
                res.add(cur.val);// 中
                cur = cur.right; // 右
            }
        }
        return res;
    }
}
