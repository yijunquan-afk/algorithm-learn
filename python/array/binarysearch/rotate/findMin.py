#
# @lc app=leetcode.cn id=153 lang=python3
#
# [153] 寻找旋转排序数组中的最小值
#

# @lc code=start
from typing import List


class Solution:
    def findMin(self, nums: List[int]) -> int:
        n = len(nums)
        left = 0
        right = n-1
        while left <= right:
            mid = int((right-left)/2) + left
            # 最小值一定在 mid 右边
            if nums[mid] > nums[n-1]:
                left = mid + 1
            else:
                right = mid - 1
        return nums[left]
# @lc code=end

