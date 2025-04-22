from typing import List


class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        n = len(nums2)
        min_stack = []
        result_map = {}
        for temp in reversed(nums2):
            while min_stack and min_stack[-1] < temp:
                min_stack.pop()
            result_map[temp] =  min_stack[-1] if min_stack else -1
            min_stack.append(temp)
        result = []
        for num in nums1:
            result.append(result_map[num])
        return result