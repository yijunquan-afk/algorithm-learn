package tree.traversal.maxDepth;

import tree.traversal.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:tree.traversal.maxDepth
 * Description:
 *
 * @date:2025/1/5 17:55
 * @author: Junquan Yi
 */
public class Solution {
    // 二叉树的最大深度
    // https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }

    // 递归做法，更好一些
    public int maxDepth2(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

    }
}
