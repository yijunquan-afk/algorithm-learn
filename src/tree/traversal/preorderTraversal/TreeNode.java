package tree.traversal.preorderTraversal;

/**
 * ClassName:TreeNode
 * Package:tree
 * Description:
 *
 * @date:2025/1/5 15:56
 * @author: Junquan Yi
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
