#
# @lc app=leetcode.cn id=1 lang=python3
#
# [1] 两数之和
#

# @lc code=start
from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash_table = {}
        for i, num in enumerate(nums):
            tmp = target - num
            if tmp in hash_table:
                return [hash_table[tmp], i]
            hash_table[num] = i
        return [-1, -1]
# @lc code=end

