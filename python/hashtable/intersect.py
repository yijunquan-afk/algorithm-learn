#
# @lc app=leetcode.cn id=350 lang=python3
#
# [350] 两个数组的交集 II
#

# @lc code=start
from typing import List


class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        num1_dict = {}
        num2_dict = {}
        for num in nums1:
            num1_dict[num] = num1_dict.get(num, 0) + 1
        for num in nums2:
            num2_dict[num] = num2_dict.get(num, 0) + 1
        res = []
        for num, count in num2_dict.items():
            if num in num1_dict:
                res.extend([num] * min(count, num1_dict[num]))
        return res
# @lc code=end

