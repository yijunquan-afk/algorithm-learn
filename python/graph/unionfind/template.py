class UnionFind:
    def __init__(self, n: int) -> None:
        self.father = list(range(n))
    
    def union(self, x: int, y: int) -> None:
        x = self.find(x)
        y = self.find(y)
        if x == y:
            return
        self.father[y] = x
    
    def find(self, x: int) -> int:
        if x != self.father[x]:
            self.father[x] = self.find(self.father[x]) # 路经压缩
        return self.father[x]
            

    
test = DisjointSet(4)
test.union(1,2)
# print(test.find(1))
print(test.find(2))