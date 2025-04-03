package dp.rob.rob3;

/**
 * ClassName:TreeNode
 * Package:dp.rob.rob3
 * Description:
 *
 * @date:2025/2/17 21:29
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
