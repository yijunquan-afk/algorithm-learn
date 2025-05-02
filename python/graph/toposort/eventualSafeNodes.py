from collections import deque
from typing import List


class Solution:
    def eventualSafeNodes(self, graph: List[List[int]]) -> List[int]:
        revert_graph = [[] for _ in graph]
        for node1, nodes in enumerate(graph):
            for node2 in nodes:
                revert_graph[node2].append(node1)
        in_degree = [len(nodes) for nodes in graph]
        q = deque([i for i,d in enumerate(in_degree) if d == 0])
        while q:
            for x in revert_graph[q.popleft()]:
                in_degree[x] -= 1
                if in_degree[x] == 0:
                    q.append(x)
        return [i for i,d in enumerate(in_degree) if d == 0]
        