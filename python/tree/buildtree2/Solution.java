package tree.buildtree2;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Solution
 * Package:tree.buildtree2
 * Description:
 *
 * @date:2025/1/18 11:55
 * @author: Junquan Yi
 */
public class Solution {
    Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++){
            inorderIndexMap.put(inorder[i], i);
        }
        return buildHelper(inorder, preorder,0, inorder.length - 1, 0, preorder.length - 1);
    }

    TreeNode buildHelper(int[] inorder, int[] preorder, int inBegin, int inEnd,  int preBegin, int preEnd) {
        if(preBegin > preEnd) return null;
        int prefirst = preorder[preBegin];
        TreeNode root = new TreeNode(prefirst); 
        int inSplitIndex = inorderIndexMap.get(prefirst); // 在中序数组的位置
        int preSplitIndex = preBegin + inSplitIndex  - inBegin;
        TreeNode left = buildHelper(inorder, preorder, inBegin, inSplitIndex -1, preBegin + 1, preSplitIndex);
        TreeNode right = buildHelper(inorder, preorder, inSplitIndex + 1, inEnd, preSplitIndex + 1, preEnd);
        root.left = left;
        root.right = right;
        return  root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] inorder = new int[]{9,3,15,20,7};
        int[] preorder = new int[]{3,9,20,15,7};
        TreeNode node = solution.buildTree(preorder, inorder);
        System.out.println(node);

    }
}
