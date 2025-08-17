#
# @lc app=leetcode.cn id=94 lang=python3
#
# [94] 二叉树的中序遍历
#

# @lc code=start
# Definition for a binary tree node.
from typing import List, Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        def inorderHelper(root):
            if root == None:
                return
            inorderHelper(root.left)
            res.append(root.val)
            inorderHelper(root.right)
        inorderHelper(root)
        return res
    
# @lc code=end

