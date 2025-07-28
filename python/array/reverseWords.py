class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip() # 首先进行简单的首位去掉空格
        start = -1
        end = 0
        r_s = []
        while end < len(s):
            if s[end] == " ":
                if start+1 <  end:
                    r_s.append(s[start+1:end])
                start = end

            end += 1
        r_s.append(s[start+1:end])
        return " ".join(reversed(r_s))
        
solution = Solution()
print(solution.reverseWords("a good   example"))