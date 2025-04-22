from typing import List


class Solution:
    def trap(self, height: List[int]) -> int:
        res = 0
        min_stack = []
        for i, h in enumerate(height):
            while min_stack and h >= height[min_stack[-1]]:
                # 单调递减栈
                bottom_h = height[min_stack.pop()]
                if not min_stack:
                    break
                left = min_stack[-1]
                dh = min(height[left], h) - bottom_h
                width = i - left - 1
                res += dh * width
            min_stack.append(i)
        return res
