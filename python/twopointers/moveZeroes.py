#
# @lc app=leetcode.cn id=283 lang=python3
#
# [283] 移动零
#

# @lc code=start
from typing import List


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        cur = tmp = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[tmp], nums[cur] = nums[cur], nums[tmp]
                tmp += 1
            cur += 1
    
                
        
# @lc code=end

