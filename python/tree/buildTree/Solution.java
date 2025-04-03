package tree.buildTree;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * Package:tree.buildTree
 * Description:
 *
 * @date:2025/1/10 17:57
 * @author: Junquan Yi
 */
public class Solution {
    // 106. 从中序与后序遍历序列构造二叉树
    // https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
    Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0; i < inorder.length; i++){
            inorderIndexMap.put(inorder[i], i);
        }
        return buildHelper(inorder, postorder,0, inorder.length - 1, 0, postorder.length - 1);
    }

    TreeNode buildHelper(int[] inorder, int[] postorder, int inBegin, int inEnd,  int postBegin, int postEnd) {
        if(postBegin > postEnd) return null;
        int postLast = postorder[postEnd];
        TreeNode root = new TreeNode(postLast); // 后序数组最后一个元素作为节点元素
        int inSplitIndex = inorderIndexMap.get(postLast); // 在中序数组的位置
        int postSplitIndex = postBegin + inSplitIndex -1 - inBegin;
        TreeNode left = buildHelper(inorder, postorder, inBegin, inSplitIndex -1, postBegin, postSplitIndex);
        TreeNode right = buildHelper(inorder, postorder, inSplitIndex + 1, inEnd, postSplitIndex + 1, postEnd - 1);
        root.left = left;
        root.right = right;
        return  root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        TreeNode node = solution.buildTree(inorder, postorder);
        System.out.println(node);

    }
}
