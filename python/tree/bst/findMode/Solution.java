package tree.bst.findMode;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:tree.bst.findMode
 * Description:
 *
 * @date:2025/1/13 20:08
 * @author: Junquan Yi
 */
public class Solution {
    // 501. 二叉搜索树中的众数
    // https://leetcode.cn/problems/find-mode-in-binary-search-tree/description/
    TreeNode pre = null;
    List<Integer> modes = new ArrayList<>();
    int maxNum = 0, curNum = 0;
    public int[] findMode(TreeNode root) {
        traversal(root);
        int[] res = new int[modes.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = modes.get(i);
        }
        return res;
    }

    void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        if (pre != null && root.val== pre.val) {
            curNum++;
        }else{
            curNum = 1;
        }
        if (curNum > maxNum) {
            modes.clear();
            maxNum = curNum;
            modes.add(root.val);
        }else if (curNum == maxNum) {
            modes.add(root.val);
        }
        pre = root;
        traversal(root.right);
    }
}
