package tree.bst.deleteNode;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.bst.deleteNode
 * Description:
 *
 * @date:2025/1/15 18:40
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/delete-node-in-a-bst/
    // 450. 删除二叉搜索树中的节点
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left == null){
                root = root.right;
            }else if(root.right == null){
                root = root.left;
            }else {
                root.val = findMinNode(root.right).val;
                root.right = removeMinNode(root.right);
            }
        }
        return root;
    }

    TreeNode findMinNode(TreeNode root) {
        if(root == null) return null;
        if(root.left == null) return root;
        else{
            return findMinNode(root.left);
        }
    }

    TreeNode removeMinNode(TreeNode root) {
        if(root == null) return null;
        if(root.left == null) return root.right;
        else{
            root.left = removeMinNode(root.left);
        }
        return root;
    }
}
