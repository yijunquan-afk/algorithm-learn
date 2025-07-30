#
# @lc app=leetcode.cn id=81 lang=python3
#
# [81] 搜索旋转排序数组 II
#

# @lc code=start
from typing import List


class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        if len(nums) == 0:
            return False
        if len(nums) == 1 and nums[0] == target:
            return True
        n = len(nums)
        left = 0
        right = n - 1
        # 处理重复
        while left <= right and  nums[0] == nums[right]:
            right -= 1
        n = right + 1
        if nums[n-1] == target:
            return True
        while left <= right:
            mid = int((right-left)/2) + left
            x = nums[mid]
            if x == target:
                return True
            # 逻辑不变
            if x <= nums[n-1] and nums[n-1] < target:
                right = mid - 1 # target 第一，mid 第二
            elif target <= nums[n-1] and nums[n-1] < x:
                left = mid + 1 # mid 第一，target 第二
            # 在同一段落
            else:
                if target > x:
                    left = mid + 1
                else:
                    right = mid - 1
        return False      
# @lc code=end
res = Solution().search([1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1], 2)
print(res)
