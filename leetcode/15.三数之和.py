#
# @lc app=leetcode.cn id=15 lang=python3
#
# [15] 三数之和
#

# @lc code=start
from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        res = []
        for i, num in enumerate(nums):
            if num > 0 or (i > 0 and nums[i] == nums[i-1]):
                continue
            target = -num
            left = i + 1
            right =n - 1
            while left < right:
                tmp = nums[left] + nums[right]
                if tmp == target:
                    res.append([num, nums[left], nums[right]])
                    while(left < right and nums[left+1] == nums[left]):
                        left += 1
                    while(right < right and nums[right-1] == nums[right]):
                        right -= 1
                    left += 1
                elif tmp > target:
                    right -= 1
                else:
                    left += 1
        return res
        
# @lc code=end

print(Solution().threeSum([-1,0,1,2,-1,-4]))
