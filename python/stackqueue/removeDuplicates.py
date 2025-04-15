from operator import add, sub, mul, div
class Solution:
    def removeDuplicates(self, s: str) -> str:
        str_stack = []
        for c in s:
            if len(str_stack) == 0 or str_stack[-1] != c:
                str_stack.append(c)
            else:
                str_stack.pop()
        return "".join(str_stack)
    
if __name__ == "__main__":
    print(int(-3/1))