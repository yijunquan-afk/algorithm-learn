from typing import List

class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        def dfs(graph, s, t):
            if s == t:
                result.append(path.copy())
                return
            for i in graph[s]:
                path.append(i)
                dfs(graph, i, t)
                path.pop()
        result = []
        path = [0]
        n = len(graph)
        dfs(graph, 0, n-1)
        return result
        