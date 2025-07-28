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
    
    # 前缀和
    def trap2(self, height: List[int]) -> int:
        n = len(height)
        pre_max = [0] * n
        suf_max = [0] * n
        pre_max[0] = height[0]
        suf_max[-1] = height[-1]
        for i in range(1, n):
            pre_max[i] = max(pre_max[i-1], height[i])
        for i in range(n-2, -1, -1):
            suf_max[i] = max(suf_max[i+1], height[i])
        
        ans = 0
        for h, pre, suf in zip(height, pre_max, suf_max):
            ans = ans + min(pre, suf) - h
        return ans