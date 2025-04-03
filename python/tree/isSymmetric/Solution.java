package tree.isSymmetric;

import tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:tree.isSymmetric
 * Description:
 *
 * @date:2025/1/7 11:40
 * @author: Junquan Yi
 */
public class Solution{
    // 101. 对称二叉树
    // 解析：https://programmercarl.com/0101.%E5%AF%B9%E7%A7%B0%E4%BA%8C%E5%8F%89%E6%A0%91.html#%E6%80%9D%E8%B7%AF
    // 题目：https://leetcode.cn/problems/symmetric-tree/description/

    // 迭代法
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return compareLeftRight(root.left, root.right);
    }

    boolean compareLeftRight(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        else if(left == null && right != null) return false;
        else if(left != null && right == null) return false;
        else {
            if(left.val != right.val) return false;
        }
        boolean outsideSame = compareLeftRight(left.left, right.right); // 外侧
        boolean insideSame = compareLeftRight(left.right, right.left); // 内侧
        return outsideSame && insideSame;
    }

    // 递归法
    public boolean isSymmetric2(TreeNode root) {
        if(root == null) return true;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if(left == null && right == null) {
                continue;
            }
            if (left == null && right != null) return false;
            if (right == null && left != null) return false;
            if (left.val != right.val) return false;
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }
}