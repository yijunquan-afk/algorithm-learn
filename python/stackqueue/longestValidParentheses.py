class Solution:
    def longestValidParentheses(self, s: str) -> int:
        ans = 0
        stack = []
        for i, c in enumerate(s):
            if stack and s[stack[-1]] == '(' and c == ')':
                stack.pop()
                if not stack: 
                    ans = max(ans, i+1)  #注意如果栈已经为空，表示都匹配成功，共i+1个括号
                else:
                    ans = max(ans, i-stack[-1])
            else:
                stack.append(i)
        return ans

