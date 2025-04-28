from collections import defaultdict
from typing import List
class Solution:
    def countPairs(self, n: int, edges: List[List[int]]) -> int:
        graph = defaultdict(list)
        for s,t in edges:
            graph[s].append(t)
            graph[t].append(s)
        count = 0
        def dfs(source):
            visited[source] = True
            nonlocal count
            count += 1
            for nex in graph[source]:
                if not visited[nex]:
                    dfs(nex)

        visited = [False] * n
        ans = total = 0
        for i in range(n):
            if not visited[i]:
                count = 0
                dfs(i)
                ans += count * total
                total += count
        return ans
