from operator import add, sub, mul
from typing import List
def div(x, y):
        # python的复数除法不太一样
        return int(x / y) 

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        op_map = {'+': add, '-': sub, '*': mul, '/': div}
        num_stack = []
        for token in tokens:
            if token not in op_map.keys():
                num_stack.append(int(token))
            else:
                num1 = num_stack.pop()
                num2 = num_stack.pop()
                num_stack.append(op_map[token](num2, num1))
        return num_stack[0]
        

if __name__ == "__main__":
    tokens = ["4","13","5","/","+"]
    print(Solution().evalRPN(tokens))