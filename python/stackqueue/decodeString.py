class Solution:
    def decodeString(self, s: str) -> str:
        # https://leetcode.cn/problems/decode-string/?envType=study-plan-v2&envId=top-100-liked
        result = ""
        num_stack = []
        res_stack = []
        k = 0
        for c in s:
            if c.isdigit():
                k = k * 10 + int(c)
            elif c == "[":
                num_stack.append(k)
                res_stack.append(result)
                result = ""
                k = 0
            elif c == "]":
                mul_num = num_stack.pop()
                result = res_stack.pop() + mul_num * result
            else:
                result += c
        return result