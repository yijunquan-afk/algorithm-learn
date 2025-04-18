from typing import List

class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        res = [0 for _ in range(n)]
        max_stack = [n-1] # 单调递减栈
        for i in range(n-2, -1, -1):
            while len(max_stack) > 0 and temperatures[max_stack[-1]] <= temperatures[i]:
                max_stack.pop()
            res[i] =0 if len(max_stack) == 0 else max_stack[-1] - i
            max_stack.append(i)
        return res

if __name__ == "__main__":
    s = Solution()
    print(s.dailyTemperatures([73, 74, 75, 71, 69, 72, 76, 73]))