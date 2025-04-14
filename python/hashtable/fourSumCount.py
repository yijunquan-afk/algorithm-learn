import collections
from typing import List


class Solution:
    # [454. 四数相加 II](https://leetcode.cn/problems/4sum-ii/)
    def fourSumCount(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:
        num12_dict = collections.defaultdict(int)
        for n1 in nums1:
            for n2 in nums2:
                num12_dict[n1+n2] += 1
        result = 0
        for n3 in nums3:
            for n4 in nums4:
                temp = n3 + n4
                if -temp in num12_dict.keys():
                    result += num12_dict.get(-temp)
        return result
        
if __name__ == "__main__":
    nums1 = [1,2]
    nums2 = [-2,-1]
    nums3 = [-1,2]
    nums4 = [0,2]
    print(Solution().fourSumCount(nums1, nums2, nums3, nums4))