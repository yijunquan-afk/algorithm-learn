from collections import defaultdict
from typing import List


class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:  
        def dfs(i):
            if i == destination:
                return True
            visited.add(i)
            for j in graph[i]:
                if j not in visited and dfs(j):
                    return True
            return False

        graph = defaultdict(list)
        for s,t in edges:
            graph[s].append(t)
            graph[t].append(s)
        visited = set()
        return dfs(source)