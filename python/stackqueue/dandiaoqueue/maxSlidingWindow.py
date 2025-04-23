from collections import deque
from typing import List

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        ans = []
        q = deque()
        for i, num in enumerate(nums):
            # 入队列尾部，跟单调栈类似，队首到队尾递减
            while q and num >= nums[q[-1]]:
                q.pop()
            q.append(i)

            # 出, 队首已经离开窗口了
            if i - q[0] + 1 > k:
                q.popleft()
            
            # 记录答案
            if i >= k - 1:
                ans.append(nums[q[0]])
        return ans
        
if __name__ == "__main__":
    
    for i, c in enumerate("123"):
        print(f"{i}: {c}")