package tree.constructMaximumBinaryTree;

import tree.TreeNode;

/**
 * ClassName:Solution
 * Package:tree.constructMaximumBinaryTree
 * Description:
 *
 * @date:2025/1/11 16:22
 * @author: Junquan Yi
 */

class Solution {
//    654. 最大二叉树
//    https://leetcode.cn/problems/maximum-binary-tree/description/
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    private TreeNode construct(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // Find the index of the maximum element in the range [left, right]
        int maxIndex = findMaxIndex(nums, left, right);

        // Create the root node with the maximum value
        TreeNode root = new TreeNode(nums[maxIndex]);

        // Recursively build the left and right subtrees
        root.left = construct(nums, left, maxIndex - 1);
        root.right = construct(nums, maxIndex + 1, right);

        return root;
    }

    // Helper function to find the index of the maximum value in the range [left, right]
    private int findMaxIndex(int[] nums, int left, int right) {
        int maxIndex = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}