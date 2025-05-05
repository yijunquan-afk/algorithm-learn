from typing import List


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n - 2
        # 从右往左找到第一个小于右侧相邻的数字
        while i >= 0 and nums[i] >= nums[i+1]:
            i-=1
        # 找到了
        if i >= 0:
            # 从右往左找到nums[i]右边最小的大于它的元素
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1 # 右边的元素从右往左单调递增
            nums[i], nums[j] = nums[j], nums[i]

        left = i + 1
        right = n - 1
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1
