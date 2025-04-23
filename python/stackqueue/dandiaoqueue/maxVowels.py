class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        ans = 0
        temp = 0
        for i, c in enumerate(s):
            if c in 'aeiou':
                temp += 1 # 入窗口
            if i < k - 1: # 窗口大小不足k
                continue
            ans = max(ans, temp)
            if s[i-k+1] in 'aeiou':
                temp -= 1 # 出窗口
        return ans


        