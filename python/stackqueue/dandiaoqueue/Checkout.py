from collections import deque

class Checkout:

    def __init__(self):
        self.q1 = deque() # 普通队列
        self.q2 = deque() # 单调队列

    def get_max(self) -> int:
        if not self.q1:
            return -1
        return self.q2[0]

    def add(self, value: int) -> None:
        self.q1.append(value)
        while self.q2 and value >= self.q2[-1]:
            self.q2.pop()
        self.q2.append(value)

    def remove(self) -> int:
        if not self.q1:
            return -1
        ans = self.q1.popleft() # 队首剔除
        if ans == self.q2[0]:
            self.q2.popleft()
        return ans

        


# Your Checkout object will be instantiated and called as such:
# obj = Checkout()
# param_1 = obj.get_max()
# obj.add(value)
# param_3 = obj.remove()