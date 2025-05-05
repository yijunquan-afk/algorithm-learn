from typing import List


class UnionFind:
    def __init__(self, n):
        self.father = list(range(n))
    
    def union(self, x, y):
        x = self.find(x)
        y = self.find(y)
        if x == y:
            return
        self.father[y] = x
    
    def find(self, x):
        if self.father[x] != x:
            self.father[x] = self.find(self.father[x])
        return self.father[x]

class Solution:
    def equationsPossible(self, equations: List[str]) -> bool:
        letter_index = dict()
        idx = 0
        equals = []
        noequals = []
        for equation in equations:
            letter1 = equation[0]
            letter2 = equation[-1]
            symbol = equation[1]
            # 分开不同的式子
            if symbol == "=":
                equals.append((letter1, letter2))
            else:
                noequals.append((letter1, letter2))
            # 编号
            if letter1 not in letter_index.keys():
                letter_index[letter1] = idx
                idx += 1
            if letter2 not in letter_index.keys():
                letter_index[letter2] = idx
                idx += 1
        union_find = UnionFind(idx) # 创建并查集
        for l1, l2 in equals:
            union_find.union(letter_index[l1], letter_index[l2])
        for l1, l2 in noequals:
            temp1 = union_find.find(letter_index[l1])
            temp2 = union_find.find(letter_index[l2])
            if temp1 == temp2:
                return False
        return True
        
        