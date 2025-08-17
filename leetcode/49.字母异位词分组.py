#
# @lc app=leetcode.cn id=49 lang=python3
#
# [49] 字母异位词分组
#

# @lc code=start
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        str_dict = {}
        res = []
        for s in strs:
            key = "".join(sorted(s))
            if key in str_dict:
                str_dict[key].append(s)
            else:
                str_dict[key] = [s]
        return list(str_dict.values())
# @lc code=end

