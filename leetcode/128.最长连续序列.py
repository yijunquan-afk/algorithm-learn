#
# @lc app=leetcode.cn id=128 lang=python3
#
# [128] 最长连续序列
#

# @lc code=start
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)
        max_len = 0
        for num in num_set:
            if num - 1 in num_set:
                continue
            cur_len = 1
            while num + 1 in num_set:
                num += 1
                cur_len += 1
            max_len = max(max_len, cur_len)
        return max_len
        
# @lc code=end

