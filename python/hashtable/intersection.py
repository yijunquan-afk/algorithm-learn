from typing import List


class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        num_set = set(nums1)
        res = set()
        for num in nums2:
            if num in num_set:
                res.add(num)
        return list(res)
        # list(set(nums1) & set(nums2))

        