package tree.sumOfLeftLeaves;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.sumOfLeftLeaves.Solution
 * Description:
 *
 * @date:2025/1/7 17:12
 * @author: Junquan Yi
 */
public class Solution {
    // 404. 左叶子之和
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0; // 终止条件
        int leftV = sumOfLeftLeaves(root.left);
        if(root.left != null && root.left.left == null && root.left.right == null){
            leftV = root.left.val;
        }
        int rightV = sumOfLeftLeaves(root.right);
        int sum = leftV + rightV;
        return sum;
    }
}
