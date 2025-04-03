package tree.traversal.postorderTraversal;

import tree.traversal.postorderTraversal.TreeNode;

import java.util.*;

/**
 * ClassName:Solution
 * Package:tree.traversal.postorderTraversal
 * Description:
 *
 * @date:2025/1/5 16:01
 * @author: Junquan Yi
 */
public class Solution {
    // 145. 二叉树的后序遍历
    // https://leetcode.cn/problems/binary-tree-postorder-traversal/description/
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversalHelper(res, root);
        return res;
    }

    public void traversalHelper(List<Integer> res, TreeNode root) {
        if(root == null) return;
        traversalHelper(res, root.left); // 左
        traversalHelper(res, root.right); // 右
        res.add(root.val); // 中
    }

    // 迭代法
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        if(root == null) return res;
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode top = stack.pop();
            res.add(top.val);
            if(top.left != null) stack.push(top.left);
            if(top.right != null) stack.push(top.right);

        }
        Collections.reverse(res);
        return res;
    }
}
