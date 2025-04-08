from ast import List


class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)
        max_len = 0
        for num in num_set: # 要在set中遍历
            if num - 1 in num_set:
                continue
            y = num + 1
            while y in num_set:
                y += 1
            max_len = max(max_len, y - num)

        return max_len


