package tree.flatten;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:tree.flatten
 * Description:
 *
 * @date:2025/3/25 16:41
 * @author: Junquan Yi
 */
public class Solution {
    /**
     * 利用二叉树空指针特性实现原地操作：
     *
     * 寻找前驱节点：
     * 当前节点左子树的最右节点即为前驱
     * 指针重定向：
     *  前驱.right → 当前.right
     *  当前.right → 当前.left
     *  当前.left → null
     */
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode next = curr.left;
                TreeNode predecessor = next;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                predecessor.right = curr.right;
                curr.left = null;
                curr.right = next;
            }
            curr = curr.right;
        }
    }

}
