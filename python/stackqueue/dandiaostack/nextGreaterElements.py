from typing import List


class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = [-1] * n
        min_stack = []
        for i in range(n*2-1, -1, -1):
            x = nums[i%n]
            while min_stack and x >= min_stack[-1]:
                min_stack.pop()
            if min_stack and i < n:
                ans[i] = min_stack[-1]
            min_stack.append(x)
        return ans