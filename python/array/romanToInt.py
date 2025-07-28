from itertools import pairwise


ROMAN = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000,
}

class Solution:
    def romanToInt(self, s: str) -> int:
        ans = 0
        for x, y in pairwise(s):  # 遍历相邻的罗马数字
            x, y = ROMAN[x], ROMAN[y]
            ans += x if x >= y else -x
        return ans + ROMAN[s[-1]]  # 加上最后一个
