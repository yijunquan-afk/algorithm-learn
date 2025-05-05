
class UnionFind:
    def __init__(self, n):
        self.father = list(range(n))
    
    def find(self, x):
        if x != self.father[x]:
            self.father[x] = self.find(self.father[x])
        return self.father[x]

    def union(self, x, y):
        x = self.find(x)
        y = self.find(y)
        if x == y:
            return
        self.father[y] = x

    def isSame(self, x, y):
        x = self.find(x)
        y = self.find(y)
        return x == y

if __name__ == "__main__":
    n = int(input())
    uf = UnionFind(n+1)
    for _ in range(n):
        x, y = map(int, input().split())
        if uf.isSame(x, y):
            print(f"{x} {y}")
        else:
            uf.union(x, y)