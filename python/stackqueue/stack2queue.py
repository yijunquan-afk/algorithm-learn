class MyQueue:
    # [232. 用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks/)
    def __init__(self):
        self.stack_in = []
        self.stack_out = []        

    def push(self, x: int) -> None:
        self.stack_in.append(x)
        return

    def pop(self) -> int:
        if len(self.stack_out) == 0:
            while len(self.stack_in) > 0:
                self.stack_out.append(self.stack_in.pop())
        return self.stack_out.pop()

    def peek(self) -> int:
        ans = self.pop()
        self.stack_out.append(ans) 
        return ans

    def empty(self) -> bool:
        return len(self.stack_in) == 0 and len(self.stack_out) == 0
