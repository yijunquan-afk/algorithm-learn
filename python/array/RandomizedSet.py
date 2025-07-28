import random

class RandomizedSet:

    def __init__(self):
        self.nums = []
        self.idx = {}

    def insert(self, val: int) -> bool:
        if val in self.idx:
            return False
        self.idx[val] = len(self.nums) # 插在最后一个
        self.nums.append(val)
        return True

    def remove(self, val: int) -> bool:
        if val not in self.idx:
            return False
        i = self.idx[val]
        self.nums[i] = self.nums[-1] # 最后一个元素往前移
        self.idx[self.nums[i]] = i # 修改下标
        self.nums.pop() # 去掉最后一个元素
        self.idx.pop(val)
        return True


    def getRandom(self) -> int:
        return random.choice(self.nums)



# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()
num = 1234
digits = list(map(int, str(num)))
print(digits)