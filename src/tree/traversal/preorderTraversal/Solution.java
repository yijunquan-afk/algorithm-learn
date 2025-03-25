package tree.traversal.preorderTraversal;

import java.util.*;

/**
 * ClassName:Solution
 * Package:tree.traversal.preorderTraversal
 * Description:
 *
 * @date:2025/1/5 15:58
 * @author: Junquan Yi
 */
public class Solution {
    // 144. 二叉树的前序遍历
    // https://leetcode.cn/problems/binary-tree-preorder-traversal/description/
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversalHelper(res, root);
        return res;
    }

    public void traversalHelper(List<Integer> res, TreeNode root) {
        if(root == null) return;
        res.add(root.val); // 中
        traversalHelper(res, root.left); // 左
        traversalHelper(res, root.right); // 右
    }

    // 迭代法
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        if(root == null) return res;
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode top = stack.pop();
            res.add(top.val);
            if(top.right != null) stack.push(top.right);
            if(top.left != null) stack.push(top.left);

        }
        return res;
    }

}
