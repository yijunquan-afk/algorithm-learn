package tree.binaryTreePaths;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

/**
 * ClassName:Solution
 * Package:tree.binaryTreePaths
 * Description:
 *
 * @date:2025/1/7 16:22
 * @author: Junquan Yi
 */
public class Solution {
    // https://leetcode.cn/problems/binary-tree-paths/
    // 257. 二叉树的所有路径
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        getPath(root, path);
        return result;
    }

    void getPath(TreeNode root, List<Integer> path) {
        path.add(root.val);
        if (root.left == null && root.right == null) { // 到了叶子结点
            String p = "";
            for(int i = 0; i < path.size()-1; i++) {
                p += path.get(i) + "->";
            }
            p += path.get(path.size()-1);
            result.add(p);
        }
        if (root.left != null) {
            getPath(root.left, path);
            path.remove(path.size() - 1);// 回溯
        }
        if (root.right != null) {
            getPath(root.right, path);
            path.remove(path.size() - 1);//回溯
        }
    }
}
