package tree.lca.lowestCommonAncestor2;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.lca.lowestCommonAncestor2
 * Description:
 *
 * @date:2025/1/14 19:42
 * @author: Junquan Yi
 */
public class Solution {
    // 235. 二叉搜索树的最近公共祖先
    // https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true){
            if(root.val < p.val && root.val < q.val){
                root = root.right;
            }else if(root.val > p.val && root.val > q.val){
                root = root.left;
            }else{
                break;
            }
        }
        return root;
    }
}
