package dp.rob.rob3;

/**
 * ClassName:Solution
 * Package:dp.rob.rob3
 * Description:
 *
 * @date:2025/2/17 21:29
 * @author: Junquan Yi
 */
public class Solution {
    public int rob(TreeNode root) {
        int[] res = robHelp(root);
        return Math.max(res[0], res[1]);
    }

    public int[] robHelp(TreeNode root){
        // 长度为2的数组，0：不偷，1：偷
        if(root == null){
            return new int[]{0,0};
        }
        int[] left = robHelp(root.left);
        int[] right = robHelp(root.right);
        int middle = root.val;
        int val1 = middle + left[0] + right[0];
        int val2 = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{val2, val1};
    }
}
