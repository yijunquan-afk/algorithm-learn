package tree.pathsum;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:tree.pathsum
 * Description:
 *
 * @date:2025/1/10 17:39
 * @author: Junquan Yi
 */
public class Solution {
    // 113. 路径总和 II
    // https://leetcode.cn/problems/path-sum-ii/description/
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return result;
        traversal(root, targetSum);
        return result;
    }

    void traversal(TreeNode root, int sum) {
        if(root.left == null && root.right == null ) {
            path.add(root.val);
            result.add(new ArrayList<>(path));
            return;
        }
        path.add(root.val);
        if(root.left != null) {
            traversal(root.left, sum - root.val);
            path.remove(path.size() - 1);
        }
        if(root.right != null) {
            traversal(root.right, sum - root.val);
            path.remove(path.size() - 1);
        }
    }
}
