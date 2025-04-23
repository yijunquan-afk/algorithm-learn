import math
from typing import List


class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        ans = -math.inf
        num_sum = 0
        for i, num in enumerate(nums):
            num_sum += num
            if i < k - 1:
                continue
            ans = max(ans, num_sum)
            num_sum -= nums[i-k+1]
        return ans/k
        