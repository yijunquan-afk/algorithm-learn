#
# @lc app=leetcode.cn id=34 lang=python3
#
# [34] 在排序数组中查找元素的第一个和最后一个位置
#

# @lc code=start
from typing import List


class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        res = [-1, -1]
        def binarySearch(nums, target):
            left = 0
            right = len(nums) - 1
            while(left <= right):
                mid = int((right-left)/2) + left
                if nums[mid] == target:
                    return mid, True
                elif nums[mid] > target:
                    right = mid - 1
                else:
                    left = mid + 1
            return left, False 
        _, find = binarySearch(nums, target)
        if find:
            left,_ = binarySearch(nums, target-0.5)
            right,_ = binarySearch(nums, target+0.5)
            res = [left, right-1]
        return res
       

# @lc code=end

if __name__ == "__main__":
    solution = Solution()
    nums = [5,7,7,8,8,10]
    target = 8
    res = solution.searchRange(nums, target)
    print(res)
