#
# @lc app=leetcode.cn id=11 lang=python3
#
# [11] 盛最多水的容器
#

# @lc code=start
from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        area_max = 0
        left = 0
        right = len(height) - 1
        while left <= right:
            area = min(height[left], height[right]) * (right - left)
            area_max = max(area, area_max)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return area_max
# @lc code=end

