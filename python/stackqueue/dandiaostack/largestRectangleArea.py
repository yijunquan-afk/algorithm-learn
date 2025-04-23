from typing import List

class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n = len(heights)
        left = [-1] * n # 左边第一个小于等于height[i]的元素下标
        right = [n] * n # 右边第一个大于等于height[i]的元素下标
        st = []
        for i, h in enumerate(heights):
            while st and h <= heights[st[-1]]:
                st.pop()
            if st:
                left[i] = st[-1]
            st.append(i)
        st.clear()
        for i in range(n-1, -1, -1):
            while st and heights[i] <= heights[st[-1]]:
                st.pop()
            if st:
                right[i] = st[-1]
            st.append(i)
        ans = 0
        for h, l, r in zip(heights, left, right):
            ans = max(ans, h * (r - 1 - l))
        return ans