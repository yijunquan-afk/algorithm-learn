import math


class StockSpanner:

    def __init__(self):
        self.min_stack = [(-1, math.inf)]
        self.idx = -1

    def next(self, price: int) -> int:
        self.idx += 1
        while  price >= self.min_stack[-1][1]:
            self.min_stack.pop()
        res = self.idx - self.min_stack[-1][0] 
        self.min_stack.append((self.idx, price))
        return res


# Your StockSpanner object will be instantiated and called as such:
# obj = StockSpanner()
# param_1 = obj.next(price)